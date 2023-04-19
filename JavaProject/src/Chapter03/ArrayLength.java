package Chapter03;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
//		double sum = 0;
//		Scanner scanner = new Scanner(System.in);
//		int intArray[] = new int[5];
//		System.out.print("5개의 정수를 입력하세요");
//		
//		for (int i = 0; i < intArray.length; i++) {
//			intArray[i] = scanner.nextInt();
//			sum += intArray[i];
//		}
//		System.out.println("평균은 "+sum/intArray.length);
		
		//강사님 답
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>>");
		
		for (int i = 0; i < intArray.length; i++) {
//			5번 반복해서 배열원소에 정수를 저장
			intArray[i] = scanner.nextInt();
		}
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.println("평균은 "+(double)sum/intArray.length);
		scanner.close();
	}

}
