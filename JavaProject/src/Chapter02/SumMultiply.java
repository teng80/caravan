package Chapter02;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2개의 정수 입력>>");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
			
//		int result1=x+y;
//		System.out.println("두 수의 합은 "+result1);
//		int result2=x*y;
//		System.out.println("두 수의 곱은 "+result2);
		
		System.out.println("두 수의 합은 "+ (x + y));
		System.out.println("두 수의 곱은 "+ x * y);
	}
}
