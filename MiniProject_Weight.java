import java.util.*;
class weightCheckException extends Exception
{
	weightCheckException(String msg)
	{
		super(msg);
	}
}
public class MiniProject_Weight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Weight: ");
		int w=sc.nextInt();
		
		if(w>18 && w<25)		{
			System.out.println("You are underweight...");
		}
		if(w>25 && w<18)
		{
			System.out.println("You are Overweight...");
		}
		else
		{
	    try {
			throw new weightCheckException("Invalid Input");
			           
                } 
        catch ( weightCheckException ex) 
        {
           ex.printStackTrace();
        }
        System.out.println("Program is not getting terminated....");
				
			}
		 sc.close();
		}
		
	}
   

