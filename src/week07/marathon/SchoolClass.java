package week07.marathon;

public class SchoolClass {																	
	private Teacher mainTeacher,asistTeacher;
	
	private int howManyStudents;
	
	
	public SchoolClass(Teacher mainTeacher, Teacher asistTeacher, int howManyStudents) {
		super();
		this.mainTeacher = mainTeacher;
		this.asistTeacher = asistTeacher;
		this.howManyStudents = howManyStudents;
		
	}

	
	public Teacher getMainTeacher() {
		return this.mainTeacher;
	}

	public void setMainTeacher(Teacher mainTeacher) {
		this.mainTeacher = mainTeacher;
	}

	public Teacher getAsistTeacher() {
		return this.asistTeacher;
	}

	public void setAsistTeacher(Teacher asistTeacher) {
		this.asistTeacher = asistTeacher;
	}

	public int getHowManyStudents() {
		return this.howManyStudents;
	}

	public void setHowManyStudents(int howManyStudents) {
		this.howManyStudents = howManyStudents;
	}

	@Override
	public String toString() {
		return "SchoolClass [mainTeacher=" + this.mainTeacher + ", asistTeacher=" + this.asistTeacher
				+ ", howManyStudents=" + this.howManyStudents  + "]";
	}

	
	
}
