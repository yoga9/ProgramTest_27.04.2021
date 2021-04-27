package Programs;

public class FinallyBlock {

	public static void main(String[] args) {
	
		try {
			
			String s = null;
			int a = 50/0;
			
		}
		
		catch(ArithmeticException  | NullPointerException e )
		{
			System.out.println("Divide by zero error");
			System.out.println("String can't be Null");
			e.getStackTrace();
		}
		
		finally {
			
			System.out.println("The exception Occured in the above cases");
		}

	}

}
