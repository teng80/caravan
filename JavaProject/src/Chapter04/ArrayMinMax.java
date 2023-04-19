package Chapter04;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
//		int max=0; 
//		int min=0;	
//		int sum=0;
//		Scanner scanner = new Scanner(System.in);
//		int intArray[] = new int[10];
//		System.out.println("양수 10개를 입력하세요");
//		
//		for (int i = 0; i < intArray.length; i++) {
//			//10번 반복해서 양수10개를 배열원소에 저장
//			intArray[i] = scanner.nextInt();
//		
//			//배열 원소가 최대값보다 크면 max에 저장
//			if (intArray[i] > max) {
//				max = intArray[i];
//			} 
////		for (int j = 0; j > intArray.length; j++) {
////			//배열 원소가 최대값보다 작으면 min에 저장
//			if (intArray[i] < min) {
//				min = intArray[i];
//			} else if (intArray[i] == 0) {
//				min = intArray[i];
//			}
////			}
//		}
//		sum =min+max;
//		System.out.println("가장 작은 수는 "+min+"이고, "
//				+ "가장 큰 수는"+max+"이고, "+"최소값+최대값은 "
//				+sum+"입니다.");

		//강사님 답
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
		int min=0;
		int max=0;
				
		System.out.println("양수 10개를 입력하세요");
		//intArray.length : 10(index:0~9)=>10번 반복
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			if (i==0) {
				min=intArray[i];
			}
			if (intArray[i]<min) {
				min=intArray[i];
			}
			if (intArray[i]>max) {
				max=intArray[i];
			}
			}
		System.out.print("가장 작은 수는 "+min+"이고, ");
		System.out.print("가장 큰 수는"+max+"이고, ");
		System.out.print("최소값+최대값은 "+(min+max)+"입니다.");
	}
}