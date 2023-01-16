package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethod3{
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		
	}
	
	@Test(priority = 2)
	public void home()
	{
		System.out.println("home test case");
	}
	
	
	@Test(priority = 3)
	public void timeline()
	{
		System.out.println("timeline test case");

	}
	
	@Test(enabled = false)
	public void profile()
	{
		System.out.println("profile test case");
	}
	
	@Test(dependsOnMethods = "profile")
	public void logout()
	{
		System.out.println("logout test case");
	
	}

}
