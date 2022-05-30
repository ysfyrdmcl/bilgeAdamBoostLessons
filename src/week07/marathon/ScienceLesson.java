package week07.marathon;

import java.time.LocalDate;

public class ScienceLesson {
	String lessonName;
	LocalDate whichYear;
	int totalHour;
	String whichDaysOfWeek;
	
	public ScienceLesson(String lessonName, LocalDate whichYear, int totalHour, String whichDaysOfWeek
			) {
		super();
		this.lessonName = lessonName;
		this.whichYear = whichYear;
		this.totalHour = totalHour;
		this.whichDaysOfWeek = whichDaysOfWeek;
		
	}
	public String getLessonName() {
		return this.lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public LocalDate getWhichYear() {
		return this.whichYear;
	}
	public void setWhichYear(LocalDate whichYear) {
		this.whichYear = whichYear;
	}
	public int getTotalHour() {
		return this.totalHour;
	}
	public void setTotalHour(int totalHour) {
		this.totalHour = totalHour;
	}
	public String getWhichDaysOfWeek() {
		return this.whichDaysOfWeek;
	}
	public void setWhichDaysOfWeek(String whichDaysOfWeek) {
		this.whichDaysOfWeek = whichDaysOfWeek;
	}
	
	@Override
	public String toString() {
		return "ScienceLesson [lessonName=" + this.lessonName + ", whichYear=" + this.whichYear + ", totalHour="
				+ this.totalHour + ", whichDaysOfWeek=" + this.whichDaysOfWeek +  "]";
	}
	
	
	
	
	
}
