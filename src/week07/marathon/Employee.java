package week07.marathon;

import java.time.LocalDate;

public abstract class Employee extends Person {
	public LocalDate dOfStartWork,dOfEndWork;
	public int salary;
	
	public Employee(String iD, String fName, String mName, String lastName, String gender, String marriageStatus,
			int mobileNo, int homeNo, LocalDate birthDay, LocalDate dOfStartWork, LocalDate dOfEndWork, int salary) {
		super(iD, fName, mName, lastName, gender, marriageStatus, mobileNo, homeNo, birthDay);
		this.dOfStartWork = dOfStartWork;
		this.dOfEndWork = dOfEndWork;
		this.salary = salary;
	}

	public LocalDate getdOfStartWork() {
		return dOfStartWork;
	}

	public LocalDate getdOfEndWork() {
		return dOfEndWork;
	}

	

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	
	
}
