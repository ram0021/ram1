package testngp;

import org.testng.annotations.Test;

public class method2 {
	@Test(dataProvider="data-provider",dataProviderClass=dataclass2.class)
	public void testMethod(String name,String mobile,String add )
	{
		System.out.println(name);
		System.out.println(mobile);
		System.out.println(add);
	}

}
