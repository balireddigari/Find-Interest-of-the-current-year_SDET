package pack16;

import org.testng.annotations.Test;

public class InvoxcationCount {

	@Test(invocationCount=20)
	void test()
	{
	System.out.println("testing...");	
	}
}
