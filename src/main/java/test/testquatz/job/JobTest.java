package test.testquatz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobTest implements Job {


	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("## Test Job Call!!");
		
		String name = arg0.getJobDetail().getJobDataMap().get("jobName").toString();
		
		System.out.println("## Job Name : "+name);
		
	}
}
