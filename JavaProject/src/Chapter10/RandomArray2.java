package Chapter10;

import java.util.Random;
import java.util.Scanner;

public class RandomArray2 {
	public static void main(String[] args) {
	//강사님 답
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int n = scanner.nextInt();//ex>24
		int array[] = new int[n];//배열크기가 24

		//array.length : 24(0~23 반복)
		for (int i = 0; i < array.length; i++) {
			int r = (int)(Math.random()*100+1);//1~100까지 난수 발생
			array[i]=r;
			
//			if (i == 0) {//첫번째는 엔터 안친다.
//				System.out.print(array[i]+" ");
//			} else {
				if (i%10 == 0) { //10번째마다 엔터 친다.
					System.out.println();
				}
//				//10번째 아닐때마다 엔터 안친다.
//			}
				System.out.print(array[i]+" ");
		}
			
			
		}
		}
	




