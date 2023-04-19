package Chapter03;

import java.util.Scanner;

public class ArithmeticExIf {

	public static void main(String[] args) {
		
//		String sign;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("연산>> ");
//		int a = scanner.nextInt();
//		sign = scanner.next();
//		int b = scanner.nextInt();
//		
//		if(sign.equals("+")) {
//			System.out.println(a+"+"+b+"의 계산 결과는 "+(a+b));
//		} else if(sign.equals("-")) {
//			System.out.println(a+"-"+b+"의 계산 결과는 "+(a-b));
//		} else if(sign.equals("*")) {
//			System.out.println(a+"*"+b+"의 계산 결과는 "+(a*b));
//		} else 
//			System.out.println(a+"/"+b+"의 계산 결과는 "+(a/b));

//	강사님 답
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>> ");
		
		int op1 = scanner.nextInt();
		String op = scanner.next();
		int op2 = scanner.nextInt();
		int res=0;
		
		if (op.equals("+")) {
			res = op1+op2;
		} else if (op.equals("-")) {
			res = op1-op2;
		} else if (op.equals("*")) {
			res = op1*op2;
		} else if (op.equals("/")) {
			if (op2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
//				프로그램 종료
				return;
			} else {
				res = op1/op2;
			}
		} else {
			System.out.println("사칙연산이 아닙니다.");
		}
		System.out.println(op1+op+op2+"의 계산 결과는 "+res);
	}
}