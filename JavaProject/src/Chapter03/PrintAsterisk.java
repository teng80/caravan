package Chapter03;

import java.util.Scanner;

public class PrintAsterisk {

	public static void main(String[] args) {
		
//		int num=0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("정수를 입력하시오>>");
//		num = scanner.nextInt();
//
//		for (int i = num; i > 0; i--) {
//			for (int j = i; j > 0; j--)	{
////				System.out.println("i =" + i +", j =" + j);
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//강사님 답
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n = scanner.nextInt();
//		구구단 => 2중 for(행과 열 출력)
//		* 갯수를 행과 열로 출력 => 2중 for 사용
//		for (int i = 0; i < n; i++) {
//		감소시키는 로직을 위해서 역으로 진행
		for (int i = n; i > 0; i--) {
//			for (int j = 0; j < n; j++) {
//			하나씩 줄이기 위해서 i값 사용
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
//			5개 출력후 엔터 필요
			System.out.println();
		}
	}
}


