package practice;

import java.time.LocalDate;

public class Task {
	
	private LocalDate date;
	private String task;


	public Task(int intYear,int intMonth,int intDate,String task){
		this.date = LocalDate.of(intYear,intMonth,intDate);
		this.task = task;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}
	

}
