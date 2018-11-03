package testngp;

import org.testng.annotations.DataProvider;

public class dataclass2 {
	@DataProvider(name="data-provider")
	public static Object[][] dataProviderMethod()
	{ 
		Object[][] data=new Object[2][3];
		data[0][0]="ram1";
		data[0][1]="1421";
		data[0][2]="tang1";
		data[1][0]="ram2";
		data[1][1]="1422";
		data[1][2]="tang2";
		
		return data;
		
	}

}
