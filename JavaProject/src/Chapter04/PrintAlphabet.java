package Chapter04;

import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char c = s.charAt(0);	//ab=>a , a=>a
		
//		for (char i = 'a'; i <= c; i++) {	//abc 계속반복(c를 입력)
		for (char i = c; i >= 'a'; i--) {	//-1씩 감소되면서 이전 알파벳 출력
//			for (char j = 'a'; j <= c; j++) {	//c까지만 반복
			//입력받은 알파벳부터 하나씩 이전 알파벳으로 반복출력
			for (char j = 'a'; j <= i; j++) {	
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
		
		
		
//		System.out.print("정수를 입력하시오(1~99)>>");
//		int n = scanner.nextInt();
//		
//		for (int i = n; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
