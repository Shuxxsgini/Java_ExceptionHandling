/*WAP to take any number and divide it by zero. 
 */

public class Example {

	public static void main(String[] args) {

		int x=8;
		try
		{
			int q=x/0;
			System.out.println(q);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Code has been succesfully excecuted without getting terminated.");
		}
	
	}

}
