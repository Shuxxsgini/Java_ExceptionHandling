
public class toString {

	public static void main(String[] args) {

		int x=8;
		try
		{
			int q=x/0;
			System.out.println(q);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("toStrinh-will show the Exception name and description not the line number.");
		}
	
	}

}
