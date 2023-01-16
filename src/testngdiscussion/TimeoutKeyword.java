package testngdiscussion;

import org.testng.annotations.Test;

public class TimeoutKeyword {
	
	@Test (timeOut = 10)
	public void Login() throws InterruptedException 
	{
		System.out.println("this is login testcase");
		Thread.sleep(15);
	}
	
	@Test(timeOut = 500)
	public void home() 
	{
		System.out.println("this is home testcase");
	}
	
	@Test(timeOut = 200)
	public void timeline() 
	{
		System.out.println("this is timeline testcase");
	}
	
	@Test(timeOut = 60)
	public void profile() 
	{
		System.out.println("this is profile testcase");
	}
	
	@Test(timeOut = 1)
	public void logout() 
	{
		System.out.println("this is logout testcase");
	}
	
	

}
