package Chapter14;

import java.util.Random;
import java.util.Scanner;

public class RandomArray2 {
//	배열과 난수의 값을 비교, array->a로 받음
	public static boolean exists(int a[], int from, int r) {
//		a.length:100(100번 반복)=>총 10000번 반복
//		i=0반복안함, i=1 1번반복, i=2 2번반복....i=99 99번 반복(100번째 숫자를 가지고)
//		for (int i = 0; i < a.length; i++) {
		for (int i = 0; i < from; i++) {
			if (a[i] == r) {
				return true;//중복발생
			}
		}
		return false;//중복아님
	}
	public static void main(String[] args) {
	
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("정수 몇개? ");
//		int n = scanner.nextInt();//ex>24
//		int array[] = new int[n];//배열크기가 24
//
//		//array.length : 24(0~23 반복)
//		for (int i = 0; i < array.length; i++) {
//			int r = (int)(Math.random()*100+1);//1~100까지 난수 발생
//						
//			for (int j = 0; j < array.length; j++) {
//				if (array[j]==r) {
//					i--;
//					continue;
//				}
//			}
//			array[i]=r;
//		}
//		for (int i = 0; i < array.length; i++) {
//			if (i == 0) {//첫번째는 엔터 안친다.
//				System.out.print(array[i]+" ");
//			} else {
//				if (i%10 == 0) { //10번째마다 엔터 친다.
//					System.out.println();
//				}
//				//10번째 아닐때마다 엔터 안친다.
//				System.out.print(array[i]+" ");
//			}
//		}
		
		//강사님 답
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int n = scanner.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < array.length; i++) {
			int r = (int)(Math.random()*100+1);//1~100까지 난수 발생
			//난수를 배열에 넣을때 중복체크
			if (exists(array, i, r)) {//i는 0,1,2...99
				i--;//없으면 중복이 5번 발생하면 95개 출력
				continue;
			}
			array[i]=r;//난수를 배열에 저장
		}
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[i]+" ");
			} else {
				if (i%10 == 0) { 
					System.out.println();
				}
				System.out.print(array[i]+" ");
			}
		}
	}
}
