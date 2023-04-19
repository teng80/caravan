package 문제연습풀이_2;

import java.util.Scanner;

public class SumMultiply {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2개의 정수 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result1 = a + b;
		int result2 = a * b;
		
		System.out.println("두수의 합은 "+result1);
		System.out.println("두수의 곱은 "+result2);
	}

}
