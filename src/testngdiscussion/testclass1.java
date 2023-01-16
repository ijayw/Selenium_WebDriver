package testngdiscussion;

import org.testng.annotations.Test;

public class testclass1 {
	
	@Test (priority = 1)
	public void Login() 
	{
		System.out.println("this is login testcase");
	}
	
	@Test(priority = 2)
	public void home() 
	{
		System.out.println("this is home testcase");
	}
	
	@Test(priority = 3)
	public void timeline() 
	{
		System.out.println("this is timeline testcase");
	}
	

	

}
