package Practice;

import java.util.Scanner;

// 	점수를 입력받아서 학점 출력 

public class Grading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int scores = sc.nextInt();
		
		switch (scores/10) {
		case 10:
			System.out.println("1등 입니다. 장학금을 타가세요.");
			break;
		case 9:
			System.out.println("등급은 A 입니다.");
			break;
		case 8:
			System.out.println("등급은 B 입니다.");
			break;
		case 7:
			System.out.println("등급은 C 입니다.");
			break;
		case 6:
			System.out.println("등급은 D 입니다.");
			break;
		case 5:
			System.out.println("등급은 E 입니다.");
			break;

		default:
			System.out.println("등급은 F입니다.");
			break;
		}
	}
}
