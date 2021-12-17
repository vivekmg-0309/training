package com.sonata.JobTracker;

import java.sql.SQLException;
import com.sonata.JobTracker.Dao.Impl.JobTrackerDaoImpl;
import com.sonata.JobTracker.Model.Task;

public class Main {
	public static void main (String [] args) throws SQLException{
		
		
		Task task = new Task();
		task.setTaskId(1);
		task.setName("Vivek M G");
		task.setOwnerId(2030);
		
		try {
			new JobTrackerDaoImpl().addTask(task);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
