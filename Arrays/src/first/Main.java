package first;

import java.util.Scanner;

public class Main {

	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[] loops;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N = ");
		numberOfLoops = input.nextInt();
		
		System.out.print("K= ");
		numberOfIterations = input.nextInt();
		
		input.close();
		
		loops = new int[numberOfLoops];
		
		nestedLoops(0);
	}
	
	public static void nestedLoops(int currentLoop) {
		if (currentLoop == numberOfLoops) {
			printLoops();
			return;
		}
		
		for (int counter = 1; counter <= numberOfIterations; counter++) {
			loops[currentLoop] = counter;
			nestedLoops(currentLoop + 1);
		}
	}
	
	public static void printLoops() {
		for (int i = 0; i < numberOfLoops; i++) {
			System.out.printf("%d ", loops[i]);
		}
		
		System.out.println();
	}	
	
	public static long recursiveFibonacci(int n) {
		if (n <= 2) {
			return 1;
		}
		
		return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
	}
	
	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}

}
