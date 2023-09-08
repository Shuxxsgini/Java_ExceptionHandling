
public class getMessage {

	public static void main(String[] args) {

		int x=8;
		try
		{
			int q=x/0;
			System.out.println(q);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("It'll show only the description of the exception.(Not the exception name n line no.");
		}
	
	}

}
