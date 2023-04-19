package 문제연습풀이_1;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		int number = 0;
		boolean mulitiple = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		number = scanner.nextInt();
		
		if (number %3 == 0) {
			System.out.println("3의 배수이다");
			mulitiple = true;
		}
		if (number %5 == 0) {
			System.out.println("5의 배수이다");
			mulitiple = true;
		}
		if (number %8 == 0) {
			System.out.println("8의 배수이다");
			mulitiple = true;
		}
		if (mulitiple == false) {
			System.out.println("어느 배수도 아니다");
		}
	}

}
