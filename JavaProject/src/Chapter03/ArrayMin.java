package Chapter03;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		
//		int n[] = new int[7];
//		int min = n[0];
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("양수를 7개 입력하세요.");
//		
//		for (int i = 0; i < n.length; i++) {
//			n[i] = scanner.nextInt();
//			
//		} if (min>n[0]) {
//			min=n[0];
//		}
//		System.out.println("가장 작은 수는 "+min+"입니다.");
		//실패
		
		//강사님 답
		
		int min = 0;
//		1.첫번째 방법
//		int min = Integer.MAX_VALUE; //int 타입의 가장 큰 숫자
		Scanner scanner = new Scanner(System.in);
		int intArray[]=new int[7];
		System.out.println("양수를 7개 입력하세요.");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			
//		2.두번째 방법
//			첫번째 반복할때 무조건 배열원소를 min에 저장
			if (i == 0) {
				min = intArray[i];
			} else {
				if (intArray[i]<min) {
					min = intArray[i];
				}
			}
		}
		System.out.println("가장 작은 수는 "+min+"입니다.");
	}
}


