package testngp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderclass {
	@Test(dataProvider="data-provider")
	public void testMethod(String param)
	{
		System.out.println(param);
		
	}
	@DataProvider(name ="data-provider")
	
	
	public static Object[][] dataProviderMethod()
	{
		return new Object[][]
				{
		         	{"first set of data"},
		         	{"first second set of data"}
				};
	}

}
