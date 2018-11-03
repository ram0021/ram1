package testngp;

import org.testng.annotations.Test;

public class Method {
	
	@Test(dataProvider="data-provider",dataProviderClass=dataclass.class)
	public void testMethod(String param)
	{
		System.out.println(param);
		
	}

}
