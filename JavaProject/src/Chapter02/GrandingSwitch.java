package Chapter02;

import java.util.Scanner;

public class GrandingSwitch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		등급 A,B,C,D,F로 분류 
		System.out.print("점수를 입력하시오(0~100) : ");
		char grade = 0;
		int score = scanner.nextInt();
	
		switch (score/10) {
		case 10: //100점
//			grade='A'
//			break;
		case 9: //90~99점
			grade='A';
			break;
		case 8: //80~89점
			grade='B';
			break;
		case 7: //70~79점
			grade='C';
			break;
		case 6: //60~69점
			grade='D';
			break;
			
		default:
			break;
		}
		System.out.println("학점은 "+grade+"입니다." );
		scanner.close();
	}


		
}
