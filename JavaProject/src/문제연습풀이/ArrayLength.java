package 문제연습풀이;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		
		int n[] = new int[5];
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>>");
		
		for (int i = 0; i < n.length; i++) {
			n[i] = scanner.nextInt();
			sum += n[i];
		}
		System.out.println("평균은 "+(double)sum/n.length);
	}

}
