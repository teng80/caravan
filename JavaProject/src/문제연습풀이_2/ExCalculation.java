package 문제연습풀이_2;

import java.util.Scanner;

public class ExCalculation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2개의 실수 입력>>");
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		
		System.out.println("두수의 덧셈은 "+(a+b));
		System.out.println("두수의 뺄셈은 "+(a-b));
		System.out.println("두수의 곱셈은 "+(a*b));
		System.out.println("두수의 나눗셈은 "+(a/b));
		

	}

}
