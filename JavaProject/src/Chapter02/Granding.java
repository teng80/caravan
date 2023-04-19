package Chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 학점 출력
 * */
public class Granding {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		등급 A,B,C,D,F로 분류 
		char grade;
		System.out.print("점수를 입력하시오(0~100) : ");
		int score = scanner.nextInt();
		
		if (score >= 90) {
			grade='A';			
		} else if (score >= 80) {
			grade='B';
		} else if (score >= 70) {
			grade='C';
		} else if (score >= 60) {
			grade='D';
		} else {
			grade='F';
		}
		System.out.println("학점은 "+grade+"입니다." );
		scanner.close();
	}
}
