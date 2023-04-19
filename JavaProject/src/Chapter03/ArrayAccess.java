package Chapter03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
//		int[] arr = new int[5];
//		int max = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("양수 5개를 입력하세요");
//		
//		for (int i = 0; i < 5; i++) {
//			arr[i] = scanner.nextInt();
//			
//			// 조건
//			// 지금 입력받은 값이, 기존에 있던 값보다 큰가 ?
//			// 그렇다면 그 값을 저장 !
//			// 최종적으로 저장되어있는 값이 출력되게하면 끝 !
//			// 방법1 : 삼항연산자 변수명= (조건식) ? 맞다면 : 아니라면;
//			// 방법2 : 조건문 if (지금값 > 기존값) { 기존값 = 지금값 } 
//			max = (arr[i] > max) ? arr[i] : max;
//			// if (arr[i] > max) { max = arr[i]; }
//		}
//		System.out.println("가장 큰 수는 "+max);
		//강사님 답
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		System.out.println("양수 5개를 입력하세요");
		
		for (int i = 0; i < intArray.length; i++) {
//			5번 반복해서 양수5개를 배열원소에 저장
			intArray[i] = scanner.nextInt();
		}
		for (int i = 0; i < intArray.length; i++) {
//			배열 원소가 최대값보다 크면 max에 저장
			if (intArray[i]> max) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 "+max+"입니다");
		scanner.close();
	}
}
