package testngp;

import org.testng.annotations.Test;

public class dtest {
	@Test
	public void ram()
	{
	System.out.println("method-one");
		
	}
	@Test(dependsOnMethods= {"ram"})
	public void a()
	{
		System.out.println("method 2");
		
	}
	@Test
	public void f()
	{
		System.out.println("method f");
		
	}
	@Test
	public void g()
	{
		System.out.println("method g");
		
	}
}
