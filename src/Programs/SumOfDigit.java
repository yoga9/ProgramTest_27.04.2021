package Programs;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int no, sum = 0, i;
		
		System.out.println("Enter the no : ");
		Scanner obj = new Scanner(System.in);
		i = obj.nextInt();
		
		while(i>0) 
		{
			no = i % 10;
			sum = sum + no;
			i = i /10;
		}
		
		System.out.println("The Sum of digits of the given no : " +sum);
			
	}

}
