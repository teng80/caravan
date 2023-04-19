package Practice;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 실수를 입력하세요 : ");
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		double sum = i+j;
		double cha = i-j;
		double gob = i*j;
		double div = i/j;
		
		System.out.println("두 수의 덧셈은  :"+sum);
		System.out.println("두 수의 뺄셈은  :"+cha);
		System.out.println("두 수의 곱셈은  :"+gob);
		System.out.println("두 수의 나눗셈은  :"+ div);
		
	}
}
