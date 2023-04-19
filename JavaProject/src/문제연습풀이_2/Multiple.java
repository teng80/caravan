package 문제연습풀이_2;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		int number=0;
		boolean muiltiple=false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		number = scanner.nextInt();
		
		if (number%3==0) {
			System.out.println("3의 배수이다");
			muiltiple = true;
		}
		if (number%5==0) {
			System.out.println("5의 배수이다");
			muiltiple = true;
		}
		if (number%8==0) {
			System.out.println("8의 배수이다");
			muiltiple = true;
		}
		if (muiltiple==false) {
			System.out.println("어느 배수도 아니다");
		}
	}
}
