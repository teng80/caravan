package Practice;

import java.util.Scanner;

public class GetSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, a = 0;
		while (a != -1) {
			sum += a;
			System.out.println("정수 입력 : ");
			a = sc.nextInt();
		}
		System.out.println("정수의 합은  "+ sum + " 입니다");
	}
}
