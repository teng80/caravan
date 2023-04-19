package 문제연습풀이;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		
		n = scanner.nextInt();
		for (int i = n; i > args.length; i--) {
			for (int j = i; j > args.length; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
