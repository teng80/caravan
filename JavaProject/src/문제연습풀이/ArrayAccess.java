package 문제연습풀이;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		int n[] = new int[5];
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수를 5개 입력하세요.");
		
		for (int i = 0; i < n.length; i++) {
			n[i] = scanner.nextInt();
			
			if (n[i]>max) {
				max = n[i];
			}
		}
		System.out.println("가장 큰 수는 " + max);
	}

}
