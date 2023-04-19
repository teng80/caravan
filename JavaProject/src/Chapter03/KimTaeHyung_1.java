package Chapter03;

import java.util.Scanner;

public class KimTaeHyung_1 {

	public static void main(String[] args) {
		
//		String password = "myongji60"; //암호
//		String input;//입력값
//		int trynumber; //암호 입력 횟수
//		boolean access = false;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		for (trynumber = 0; trynumber < 3; trynumber++) {
//			System.out.print("암호를 입력하세요: ");
//			input = scanner.next();
//			if (input.equals(password)) {
//				System.out.println("환영합니다");
//				access = true;
//				break;
//			} else {
//				System.out.println("암호가 틀립니다");
//				}
//		}
//			if (!access) {
//				System.out.println("접속을 거부합니다");
//			}
		
		//강사님 답
		
		//암호를 'myongji60'으로 초기화한다
		String password = "myongji60"; //암호
		String input;//입력값
		int trynumber=0; //암호 입력 횟수
		
		Scanner scanner = new Scanner(System.in);
		//계속 반복한다
		while (true) {
			//'암호를 입력하세요:'를 출력한다
			System.out.print("암호를 입력하세요: ");
			//암호를 입력받아 input에 저장한다
			input = scanner.next();
			//암호 입력 횟수를 1만큼 증가시킨다
			trynumber++;
			
			//input이 password와 같다면 '환영합니다'를 출력하고 나간다
			if (input.equals(password)) {
				System.out.println("환영합니다");
				break;
			}
			System.out.println("암호가 틀립니다");
			//trynumber가 3이라면 '접속을 거부합니다'를 출력하고 나간다
			if (trynumber==3) {
				System.out.println("접속을 거부합니다");
				break;
			}
		}
	}
}
