package 문제연습풀이_1;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		int a = scanner.nextInt();
		String s = scanner.next();
		int b = scanner.nextInt();
		int res = 0;
		
		if (s.equals("+")) {
			res=a+b;
		} else if (s.equals("-")) {
			res=a-b;
		} else if (s.equals("*")) {
			res=a*b;
		} else if (s.equals("/")) {
			if (b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			} else {
			res=a/b;
			}
		} else {
			System.out.println("사칙연산이 아닙니다.");
		}
		System.out.println(a+s+b+"의 계산 결과는 "+res);
	}
}
  