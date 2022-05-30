package week07.marathon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolManagementSystem {
	List <Employee> employees;
	List <Student> students;
	List <Teacher>  teachers;
	
	public SchoolManagementSystem() {
		super();
		this.employees = new ArrayList<>();
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to School Management System\n");
		SchoolManagementSystem newSchool = new SchoolManagementSystem();
		Scanner scan = new Scanner (System.in);
		
		while(true) {
		System.out.println("1-Yeni calisan ekle\n2-Calisan Listesine bak\n3-Eski Calisanlara bak"
				+ "\n4-Yeni sinif yarat\n5-Ogrenci ata\n6-Sinif listesine bak"
				+ "\n7-Ogrencinin katildigi siniflara bak 	YETISMEDI\n8-Hediye Listesi 	YETISMEDI\n9-Maas Listesi 	YETISMEDI\n10-Cikis");
		int menu = scan.nextInt();
		
		switch (menu) {
		case 1:
			newSchool.AddEmployee();
			break;
		case 2:
			newSchool.ListEmployee();
			break;
		case 3:
			newSchool.OldEmployees();
			break;
		case 4:
			newSchool.CreateNewClass();
			newSchool.CreateNewLesson();
			break;
		case 5:
			newSchool.AddStudents();
			break;
		case 6:
			newSchool.ClassInfo();
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			System.out.println("Bye..");
			System.exit(0);
			break;
			
		default:
			break;
		}
		
		
		}	
		
	}

	private void AddEmployee() {
		
		Teacher teacher1 = new Teacher("T-001","Kemal","Servet","Demir","Male","Married"
				,05555555,0222222,LocalDate.of(1990, 2, 27),LocalDate.of(2020, 2, 1),LocalDate.of(2028, 2, 1),8000);
		Teacher teacher2 = new Teacher("T-002","Ali","Ahmet","Su","Male","Single"
				,0666666,0333333,LocalDate.of(1992, 3, 14),LocalDate.of(2021, 4, 6),LocalDate.of(2029, 2, 1),8000);
		Teacher assistantTeacher = new Teacher("T-003","Ayla","Cilek","Köfte","Female","Single"
				,0777777,0444444,LocalDate.of(1995, 8, 6),LocalDate.of(2019, 4, 8),LocalDate.of(2030, 2, 1),6000);
		Teacher assistantTeacher2 = new Teacher("T-004","Ayse","Fatma","Hayriye","Female","Married"
				,0777577,055555,LocalDate.of(1997, 10, 17),LocalDate.of(2018, 11, 22),LocalDate.of(2031, 2, 1),6000);
		Worker  worker = new Worker("W-001","Mustafa","Ziya","Pullu","Male","Married"
				,07775727,0555455,LocalDate.of(1989, 10, 17),LocalDate.of(2011, 5, 4),LocalDate.of(2026, 2, 1),7000);
		Servant servant = new Servant("S-001","Mehmet","Tarik","Tutkulu","Male","Single"
				,07775727,0555455,LocalDate.of(1988, 10, 17),LocalDate.of(2017, 12, 30),LocalDate.of(2024, 2, 1),6500);
		
		
		
		Teacher teacher3 = new Teacher("T-005","Deniz","Aykut","Mim","Male","Married"									//işten çıkarılanlar.	
				,0755515555,02225222,LocalDate.of(1978, 2, 27),LocalDate.of(2020, 5, 5),LocalDate.of(2022, 4, 10),7500);
		
		Worker worker2 = new Worker("W-002","Selim","Melim","Yelim","Male","Single"								
				,0755515555,02225222,LocalDate.of(1982, 4, 17),LocalDate.of(2018, 2, 3),LocalDate.of(2021, 5, 4),3000);
		this.teachers.add(teacher1);
		this.teachers.add(teacher2);												
		this.employees.add(teacher1);
		this.employees.add(teacher2);
		this.employees.add(assistantTeacher);
		this.employees.add(assistantTeacher2);
		this.employees.add(worker);
		this.employees.add(servant);
		this.employees.add(teacher3);
		this.employees.add(worker2);

	}
	
	private void ListEmployee() {
	  List<Employee> currentEmployeesList= 
	  employees.stream().filter(currentEmployees -> currentEmployees.dOfEndWork.isAfter(LocalDate.now()))		//İşten çıkma tarihi(Sözleşmesi)Günümüze kadar uzatılmamış olanları listelemedim.
		.collect(Collectors.toList());
		
	  for (Employee employee : currentEmployeesList) {
		System.out.println(employee);
	}
	}
	
	private void OldEmployees() {
		
	  List<Employee> oldEmployeesList= 
		employees.stream().filter(oldEmployees -> oldEmployees.dOfEndWork.isBefore(LocalDate.now()))
		.collect(Collectors.toList());
					
	  for (Employee employee : oldEmployeesList) {
		System.out.println(employee);
}
		  
}
	
	private void CreateNewClass() {																//Yeni sınıf, 2 ögretmen
																								//Totalde 25 ögrenci alıyor		
		SchoolClass newClass = new SchoolClass(this.teachers.get(0),this.teachers.get(1),25);
		System.out.println("\n"+newClass);
		
	}
	private void CreateNewLesson() {
		
		ScienceLesson newLesson = new ScienceLesson("Fen bilgisi",LocalDate.of(2022, 01, 01),88,"Monday-Friday- 2hour per day.");
		System.out.println(newLesson);
	}
	
	private void AddStudents() {
		try {
		Student student1 = new Student("2022-001","Velican"," ","Can","Male","Single",
				0525,3587,444445,LocalDate.of(2010, 1, 1),LocalDate.now(),LocalDate.of(2026, 05, 30));
		Student student2 = new Student("2022-002","Alican"," ","Con","Male","Single",
				0525,3587,444445,LocalDate.of(2010, 2, 1),LocalDate.now(),LocalDate.of(2026, 05, 30));
		Student student3 = new Student("2022-003","Nazlican"," ","Cun","Female","Married",							//evli
				0525,3587,444445,LocalDate.of(2010, 3, 1),LocalDate.now(),LocalDate.of(2026, 05, 30));
		Student student4 = new Student("2022-004","Aysecan"," ","Cuk","Female","Single",
				0525,3587,444445,LocalDate.of(2010, 2, 2),LocalDate.now(),LocalDate.of(2026, 05, 30));
		Student student5 = new Student("2022-005","Fatmacan"," ","Cin","Female","Single",
				0525,3587,444445,LocalDate.of(2010, 5, 4),LocalDate.now(),LocalDate.of(2026, 05, 30));
		
		this.students.add(student1);
		this.students.add(student2);
		this.students.add(student3);
		this.students.add(student4);
		this.students.add(student5);
		
		
		for (Student stdnt : students) {
			System.out.println(stdnt);
		}
		 List<Student> marriedStudentList=
		students.stream()
		.filter(stdnt -> stdnt.getMarriageStatus().equalsIgnoreCase("Married"))							//Burada öğrencilerin evli olma seçeneğini filtreleyip
		.collect(Collectors.toList());																	// yeni listeye attım. Sonra da Try catch ile yakaladım.

			if(marriedStudentList !=null) {
				throw new MarriageException();
			}
			
	} catch (MarriageException e) {
		
			System.out.println("Caught the exception\n");
		}	
		
	}
	
	private void ClassInfo() {
		for (Student stdnt : students) {
			System.out.println(stdnt);
		}	
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}
	}

}
