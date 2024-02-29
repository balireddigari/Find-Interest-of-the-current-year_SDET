package pack15;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority=1,groups= {"sanity","regression"})
	void  loginByEmail() {
		System.out.println("this is login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void  loginByFacebook() {
		System.out.println("this is login by Facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void  loginBytwitter() {
		System.out.println("this is login by email");
	}
	@Test(priority=4,groups= {"sanity","regression"})
	void signupbyemail() {
		System.out.println("this is login by email");
	}
	@Test(priority=5,groups= {"regression"})
	void  signupByfacebook() {
		System.out.println("this is login by email");
	}
	@Test(priority=6,groups= {"regression"})
	void  signupbytwitter() {
		System.out.println("this is login by email");
	}
	@Test(priority=7,groups= {"sanity","regression"})
	void  paymentinrupees() {
		System.out.println("this is login by email");
	}
	@Test(priority=8,groups= {"sanity"})
	void  paymentindollar() {
		System.out.println("this is login by email");
	}
	@Test(priority=9,groups= {"regression"})
	void  paymentReturn() {
		System.out.println("this is login by email");
	}
}
