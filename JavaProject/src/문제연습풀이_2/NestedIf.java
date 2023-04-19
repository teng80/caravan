package 문제연습풀이_2;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
	
		int point = 0, year = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		point = scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		year = scanner.nextInt();
		
		if (point>=60) {
			if (year!=4) {
				System.out.println("합격!");
			} else if (point>=70) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격!");
			}
		} else {
			System.out.println("불합격!");
			
		}

	}

}
