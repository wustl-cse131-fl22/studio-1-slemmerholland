package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What is value 1?");
		int n1 = in.nextInt();
		System.out.println ("What is value 2?");
		int n2 = in.nextInt();
		double average = ((n1 + n2) / 2.0);
		System.out.println ("The average is " + average);
				
		// TODO Auto-generated method stub

	}

}
