
public class Throwable {

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
			System.out.println("Throwable will show the same message , its just a different approach.");
		}
	
	}


}
