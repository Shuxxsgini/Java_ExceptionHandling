import java.util.*;
class ageCheckException extends Exception
{
	ageCheckException(String msg)
	{
		super(msg);
	}
}

 class MiniProject_Voting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        if (age >= 18) 
        {
            System.out.println("You are eligible to vote.");
        } 

        else
        {
        try {
        	
        	throw new ageCheckException("You are not eligeble to vote.");
           
        } 
        catch ( ageCheckException ex) 
        {
           ex.printStackTrace();
        }
        System.out.println("Program is not getting terminated....");
      }
        sc.close();
    }
}
