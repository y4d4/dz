package myfirstpackage;

import java.util.Scanner;

public class Problem_2 {
	
	public static void main(String[] args) {
		System.out.println("Enter your nunber: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int nnum = num+1;
		int pnum = num-1;
		
		System.out.println("The next number for the number " + num + " is " + nnum + ".");
		System.out.println("The previous number for the number " + num + " is " + pnum + ".");
	}
}
