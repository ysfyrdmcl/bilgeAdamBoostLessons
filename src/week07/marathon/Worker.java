package week07.marathon;

import java.time.LocalDate;

public class Worker extends Employee{

	public Worker(String iD, String fName, String mName, String lastName, String gender, String marriageStatus,
			int mobileNo, int homeNo, LocalDate birthDay, LocalDate dOfStartWork, LocalDate dOfEndWork, int salary) {
		super(iD, fName, mName, lastName, gender, marriageStatus, mobileNo, homeNo, birthDay, dOfStartWork, dOfEndWork, salary);
	
	}

	@Override
	public String toString() {
		return "Worker  [DayOfStartWork=" + this.getdOfStartWork() + ", DayOfEndWork=" + this.getdOfEndWork()
		+ ", Salary()=" + this.getSalary() + ", iD=" + this.getiD() + ", FirsthName=" + this.getfName()
		+ ", MiddleName=" + this.getmName() + ", LastName=" + this.getLastName() + ", Gender="
		+ this.getGender() + ", MarriageStatus=" + this.getMarriageStatus() + ", MobileNo="
		+ this.getMobileNo() + ", HomeNo=" + this.getHomeNo() + ", BirthDay=" + this.getBirthDay()
		+ "]";
	}

}
