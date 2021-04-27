package Programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Java is best";
		
		System.out.println("The Original string : "+s);
		
		String reverseObj = new StringBuffer(s).reverse().toString();
		
		System.out.println("The reverse string : "+reverseObj);
		
	}

	
}
