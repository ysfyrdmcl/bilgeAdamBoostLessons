package week07.marathon;

import java.time.LocalDate;

public abstract class Person {
	private String iD,fName,mName,lastName,gender,marriageStatus;
	private int mobileNo,homeNo;
	private LocalDate birthDay;
	
	public Person(String iD, String fName, String mName, String lastName, String gender, String marriageStatus,
			int mobileNo, int homeNo, LocalDate birthDay) {
		super();
		this.iD = iD;
		this.fName = fName;
		this.mName = mName;
		this.lastName = lastName;
		this.gender = gender;
		this.marriageStatus = marriageStatus;
		this.mobileNo = mobileNo;
		this.homeNo = homeNo;
		this.birthDay = birthDay;
	}
	
	

	public String getiD() {
		return this.iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getfName() {
		return this.fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return this.mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public  String getMarriageStatus() {
		return this.marriageStatus;
	}

	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}

	public int getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getHomeNo() {
		return this.homeNo;
	}

	public void setHomeNo(int homeNo) {
		this.homeNo = homeNo;
	}

	public LocalDate getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}



	
	
	
	
}
