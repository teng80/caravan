package Chapter03;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {

//		String str = "exit";
//		String a = null, b;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("exit을 입력하면 종료합니다. ");
//		a = scanner.next();
//		
//		while(true) {
//			System.out.print(">>");
//			b = scanner.next();
//			if (a.equals(str)) {
//				
//				System.out.println("종료합니다...");
//				break;	
//			}
//		}
		
		//강사님 답
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
//		무한반복 : 반복횟수는 알 수 없음(exit가 나오면 break)
		while (true) {
			System.out.print(">>");
			String text = scanner.next();
			
//			입력받은 문자열이 exit면 빠져나옴
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("종료합니다...");
		scanner.close();
	}
}


