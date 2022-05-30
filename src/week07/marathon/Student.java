package week07.marathon;

import java.time.LocalDate;

public class Student extends Person{
	
	private int parentMobileNo;
	private LocalDate dOfStartSchool,dOfEndSchool;
	
	public Student(String iD, String fName, String mName, String lastName, String gender, String marriageStatus,
			int mobileNo, int homeNo, int parentMobileNo,LocalDate birthDay,LocalDate dOfStartSchool,LocalDate dOfEndSchool) {
		super(iD, fName, mName, lastName, gender, marriageStatus, mobileNo, homeNo, birthDay);
		this.dOfStartSchool =dOfStartSchool;
		this.dOfEndSchool =dOfEndSchool;
		this.parentMobileNo=parentMobileNo;
		
		
	}


	public int getParentMobileNo() {
		return this.parentMobileNo;
	}

	public void setParentMobileNo(int parentMobileNo) {
		this.parentMobileNo = parentMobileNo;
	}

	public LocalDate getdOfStartSchool() {
		return this.dOfStartSchool;
	}

	public void setdOfStartSchool(LocalDate dOfStartSchool) {
		this.dOfStartSchool = dOfStartSchool;
	}

	public LocalDate getdOfEndSchool() {
		return this.dOfEndSchool;
	}

	public void setdOfEndSchool(LocalDate dOfEndSchool) {
		this.dOfEndSchool = dOfEndSchool;
	}

	@Override
	public String toString() {
		return "Student ==[iD()=" + this.getiD() + ", dOfStartSchool="
				+ this.dOfStartSchool + ", dOfEndSchool=" + this.dOfEndSchool 
				+ ", Name()=" + this.getfName() + ", mName()=" + this.getmName() + ", LastName()="
				+ this.getLastName() + ", Gender()=" + this.getGender() + ", MarriageStatus()="
				+ this.getMarriageStatus() + ", MobileNo()=" + this.getMobileNo() +"parentMobileNo=" + this.parentMobileNo + ", HomeNo()="
				+ this.getHomeNo() + ", BirthDay()=" + this.getBirthDay() + "]";
	}

	

	
	
	
}
