package testngdiscussion;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.annotations.Test;

public class EnableKeyword {
	
	@Test (priority = 1)
	public void Login() 
	{
		System.out.println("this is login testcase");
	}
//	these test case during execution do not considered
	@Test(priority = -20,enabled = false)
	public void home() 
	{
		System.out.println("this is home testcase");
	}
	
	@Test(priority = 3)
	public void timeline() 
	{
		System.out.println("this is timeline testcase");
	}
	
	@Test(priority = -4)
	public void profile() 
	{
		System.out.println("this is profile testcase");
	}
//negative Number higher value	
	@Test(priority = -50)
	public void logout() 
	{
		System.out.println("this is logout testcase");
	}
	
	

}
