package Array1p;

public class Test2 {

	public static void main(String[] args) {
		String x="Welcome to Java Session Session Session";
		 String[] my_array = x.split(" ");
		 
	        for (int i = 0; i < my_array.length-1; i++)
	        {
	            for (int j = i+1; j < my_array.length; j++)
	            {
	                if ((my_array[i] == my_array[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+my_array[j]);
	                }
	            }
	        }

	}

}
