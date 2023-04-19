package 문제연습풀이;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2개의 정수 입력>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.out.println("두수의 합은 "+(n1+n2));
		System.out.println("두수의 곱은 "+(n1*n2));
		
	}
}
