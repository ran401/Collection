package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
	
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
	
	
    @Override
    public int compareTo(Task otherTask) {
        // 年齢で比較する例
        return this.date.compareTo(otherTask.date);
    }

}
