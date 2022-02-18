package qaace22Training;

import java.util.Scanner;

public class PermutationsAndCombinations {
	static int factorial(int n) {
		int fact = 1;
		int i = 1;
		while(i <= n) { fact *= i; i++;} 
		return fact;
	}
	public static void main(String[] args) 
	{
		int n, r, comb, per;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Value of n : ");
		n = scanner.nextInt();
		System.out.print("Enter Value of r : ");
		r = scanner.nextInt();
		per = factorial(n) / factorial(n-r);
		System.out.println("Permutation: " + per);
		comb = factorial(n) / (factorial(r) * factorial(n-r));
		System.out.println("Combination: " + comb);
		scanner.close();
	}
}
