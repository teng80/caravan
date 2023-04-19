package 문제연습풀이;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2개의 실수 입력>>");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		System.out.println("두수의 덧셈은 "+(n1+n2));
		System.out.println("두수의 뺄셈은 "+(n1-n2));
		System.out.println("두수의 곱셈은 "+(n1*n2));
		System.out.println("두수의 나눗셈은 "+(n1/n2));
		
	}
}
