package pack13;

import org.testng.annotations.Test;

public class MyFirst 
{
	
	@Test(priority=0)
	void test1() 
	{
		System.out.println("Hello");
	}
	
	
	@Test(priority=1)
	void test2() 
	{
		System.out.println("Hello Bhargavi");
	}
	
	
	@Test(priority=2)
	void test3()
	{
		System.out.println("Hello Bhanu");
	}
  
}
