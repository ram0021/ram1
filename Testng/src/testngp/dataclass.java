package testngp;

import org.testng.annotations.DataProvider;

public class dataclass {
	
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
