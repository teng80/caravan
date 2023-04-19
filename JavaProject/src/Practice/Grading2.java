package Practice;

import java.util.Scanner;

// 	점수를 입력받아서 학점 출력 

public class Grading2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.println("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		
		if (score >= 90) {
			grade='A';
		}else if (score >= 80) {
			grade='B';
		}else if (score >= 80) {
			grade='C';
		}else if (score >= 80) {
			grade='E';
		}else {
			grade='F';
		}
		System.out.println("학점은"+grade+"입니다.");
	}
}
