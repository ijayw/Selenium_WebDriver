package testngdiscussion;

import org.testng.annotations.Test;

public class testclass2 extends testclass1 {
	
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
	
	@Test(priority = 4)
	public void profile() 
	{
		System.out.println("this is profile testcase");
	}
	
	@Test(priority = 5)
	public void logout() 
	{
		System.out.println("this is logout testcase");
	}
	

}
