package week07.marathon;

import java.util.List;

public class School {																		
	
	private List <SchoolClass> schoolClasses;
	private List <Student> students;
	private List <Employee>  employees;
	
	public School(List<SchoolClass> schoolClasses, List<Student> students, List <Employee>  employees
			) {
		super();
		this.schoolClasses = schoolClasses;
		this.employees = employees;
		this.students = students;
		
	}
	public List<SchoolClass> getSchoolClasses() {
		return this.schoolClasses;
	}
	public void setSchoolClasses(List<SchoolClass> schoolClasses) {
		this.schoolClasses = schoolClasses;
	}
	public List<Student> getStudents() {
		return this.students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Employee> getEmployees() {
		return this.employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "School [schoolClasses=" + this.schoolClasses + ", students=" + this.students + ", employees="
				+ this.employees + "]";
	}
	
	

}
