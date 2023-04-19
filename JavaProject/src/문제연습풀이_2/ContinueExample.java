package 문제연습풀이_2;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		int sum=0, num=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		
		for (int i = 1; i <= 5; i++) {
			num = scanner.nextInt();
			if (num > 0) {
				sum += num;
			}
		}
		System.out.println("양수의 합은 "+sum);

	}

}
