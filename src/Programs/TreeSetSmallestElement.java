package Programs;

import java.util.TreeSet;

public class TreeSetSmallestElement  {

	public static void main(String[] args) {
		
		TreeSet<Integer> min = new TreeSet<Integer>();
		
		 min.add(50);
		 min.add(30);
		 min.add(60);
		 min.add(20);
		 min.add(40);
		 
		System.out.println("The TreeSet list are :" +min); 
		
		System.out.println("The Smallest Element in the above list : "+min.first());
		 
		
	}

}
