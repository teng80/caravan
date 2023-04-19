package Chapter03;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		
//		int attendrate = 0, totalscore;
//		char grade;
//		boolean cheating;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("부정행위 여부(true 혹은 false): ");
//		cheating = scanner.nextBoolean();
//		
//		if (cheating) {
//			System.out.println("F");
//			} else {
//				System.out.print("출석률(0~ 100사이의 정수값): ");
//				attendrate = scanner.nextInt();
//				System.out.print("총점(0~ 100사이의 정수값): ");
//				totalscore = scanner.nextInt();
//				if (attendrate < 80) {
//					grade = 'F';
//				} else if (totalscore >= 90) {
//					grade = 'A';
//				} else if (totalscore >= 80) {
//					grade = 'B';
//				} else if (totalscore >= 70) {
//					grade = 'C';
//				} else if (totalscore >= 60) {
//					grade = 'D';
//				} else
//					grade = 'F';
//			}
//		System.out.println("학점 = " + grade);
		
		//강사님 답
		int attendrate = 0, totalscore;
		char grade;
		boolean cheating;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("부정행위 여부(true 혹은 false): ");
		cheating = scanner.nextBoolean();
		
		System.out.print("출석률(0~ 100사이의 정수값): ");
		attendrate = scanner.nextInt();
		
		System.out.print("총점(0~ 100사이의 정수값): ");
		totalscore = scanner.nextInt();
		
		if (cheating) {
			grade='F';
		} else if (attendrate < 80) {
			grade='F';
		} else {
			if (totalscore >= 90) {
				grade='A';
			} else if (totalscore >= 80) {
				grade='B';
			} else if (totalscore >= 70) {
				grade='C';
			} else if (totalscore >= 60) {
				grade='D';
			} else {
				grade='F';
			}
		}
		System.out.println("학점 = " + grade);
	}
}
