package practice;

import java.util.ArrayList;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		List<Task> taskList_bef = new ArrayList<>();
		List<Task> taskList_aft = new ArrayList<>();
		
		taskList_bef.add(new Task(2021,10,21,"牛乳を買う"));
		taskList_bef.add(new Task(2021,9,15,"○○社面談"));
		taskList_bef.add(new Task(2021,8,10,"散髪に行く"));
		taskList_bef.add(new Task(2021,11,9,"スクールの課題を解く"));
		taskList_bef.add(new Task(2021,12,4,"手帳を買う"));
		
		for(Task a : taskList_bef) {
			
			if (taskList_aft.isEmpty()) {
				taskList_aft.add(a);
			}else {
				for (int i = 0; i <= taskList_aft.size(); i++) {
					if (i == taskList_aft.size()){
						taskList_aft.add(i,a);
						break;
					}
					if (a.getDate().isBefore(taskList_aft.get(i).getDate())){
						taskList_aft.add(i,a);
						break;
					}
				} 
			}
		}
		
		for(Task b : taskList_aft) {
			System.out.println(b.getDate() + "：" + b.getTask());
		}
		
	}

}
