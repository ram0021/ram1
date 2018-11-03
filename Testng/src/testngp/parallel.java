package testngp;

import org.testng.annotations.Test;

public class parallel {
	
	
	@Test
	public void m1() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("m1"  +i);
			Thread.sleep(1000);
		}
	}
	@Test
	public void m2() throws Exception
	{
		for(int i=100;i<110;i++)
		{
			System.out.println("m2"   +i);
			Thread.sleep(1000);
			
		}
	}
	

}
