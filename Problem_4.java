package myfirstpackage;

import java.util.Scanner;

public class Problem_4 {
	public static void main(String[] args) {
		
		System.out.println("Введіть кількість школярів: ");
		System.out.println("Введіть кількість яблук: ");
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum = K % N;
		
		System.out.println(sum);
	}
}