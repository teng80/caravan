package Chapter04;

import java.util.Scanner;

public class MutipleOfThree {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int intArray[] = new int[10];
//		System.out.println("양의 정수 10개를 입력하시오>>");
//		for (int i = 0; i<intArray.length; i++) {
//			intArray[i] = scanner.nextInt();
//		}
//		
//		System.out.print("3의 배수는 "); // 10번 반복되면 안되니까, 반복문 밖으
//		
//		for (int i = 0; i < intArray.length; i++) {
//			if (intArray[i]%3==0) {
//				System.out.print(intArray[i]+" ");
//			} 
//		}
		//ok
		
		//강사님 답
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
		System.out.print("양의 정수 10개를 입력하시오>>");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		System.out.print("3의 배수는 ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i]%3==0) {
				System.out.print(intArray[i]+" ");
			}
		}
	}
}
