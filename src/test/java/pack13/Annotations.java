package pack13;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeClass
	public void login() {
		
		System.out.println("login");
	}
	@Test
	public void search() {
		
		System.out.println("ABc");
	}
	@Test
	public void AdvancedSearch() {
	
		System.out.println("login");
}
	@AfterClass
	public void logout() {
	
		System.out.println("login");
}
 
}