package myfirstpackage;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		
		System.out.println("Введіть першу сторону трикутника: ");
		System.out.println("Введіть друг сторону трикутника: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a*a+b*b; 
		
		System.out.println(sum);
	}
}
