package Chapter02;

import java.util.Scanner;

public class ExCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 실수입력>>");
//		nextDouble() : 실수를 받는 메소드
		double x=sc.nextDouble();
		double y=sc.nextDouble();
	
		double result1=x+y;
		System.out.println("두 수의 덧셈은: "+result1);
		double result2=x-y;
		System.out.println("두 수의 뺄셈은: "+result2);
		double result3=x*y;
		System.out.println("두 수의 곱셈은: "+result3);
		double result4=x/y;
		System.out.println("두 수의 나눗셈은: "+result4);
		
		sc.close();

		
		
		
		
	
	
	}


}
