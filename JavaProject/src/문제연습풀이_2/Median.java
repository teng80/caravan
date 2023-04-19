package 문제연습풀이_2;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a>b&&a<c||a<b&&a>c) {
			System.out.println("중간 값은 "+a);
		} else if (b>a&&b<c||b<a&&b>c) {
			System.out.println("중간 값은 "+b);
		} else {
			System.out.println("중간 값은 "+c);
		}

	}

}
