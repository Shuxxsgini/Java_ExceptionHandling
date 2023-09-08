
public class StackTrace {

	public static void main(String[] args) {

		int x=8;
		try
		{
			int q=x/0;
			System.out.println(q);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			                    
		}
		finally
		{
			System.out.println("This is second approach to catch the exception\r\n"
					+ "It'll show- Exception Name,Description,line number");
		}
	
	}

}
