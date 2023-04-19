package Chapter03;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		
		int n, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요. ");
		
		for (int i = 0; i < 5; i++) {
			n = scanner.nextInt();
			if (n<=0) {
//				i++ 증감쪽으로 이동
				continue;
			} else {
				sum += n;
			}
			/*
//			양수일때
			if (n > 0) {
//				sum에 값을 누적
				sum += n;
			} 
			*/
		}
		System.out.println("양수의 합은 " + sum);
		scanner.close();
	}
}
