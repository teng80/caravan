package 문제연습풀이_2;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		int n[] = new int[5];
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("양수를 입력하세요.");
		for (int i = 0; i < 5; i++) {
			n[i] = scanner.nextInt();
			if (n[i]>max) {
				max = n[i];
			} 
		}
		System.out.println("가장 큰 수는" + max + "입니다");
	}
}
