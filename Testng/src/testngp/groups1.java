package testngp;

import org.testng.annotations.Test;

public class groups1 {
	@Test(groups= {"smoetest"})
	public void m1()
	{
		System.out.println("firstmethod");
	}
	@Test(groups= {"smoktest"})
	public void m2()
	{
		System.out.println("secondmethod");
	}

	@Test
	public void m3()
	{
		System.out.println("third method");
	}

	@Test(groups= {"smoktest"})
	public void m4()
	{
		System.out.println("fourthmethod");
	}
}

