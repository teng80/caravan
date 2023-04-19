package Chapter04;

import java.util.Random;

public class RandomTen {

	public static void main(String[] args) {
//		int rNumber[] = new int[10];
//		double sum=0, avg=0;
//		Random generator = new Random();
//		
//		System.out.print("랜덤한 정수들 : ");
//		
//		for (int i = 0; i < 10; i++) {
//			rNumber[i] = generator.nextInt(10)+1; //난수 발생(1~10의 정수)
//			sum += rNumber[i];
//			System.out.print(rNumber[i]);
//		}
//		System.out.println(sum/10);
		//실패
		
		//강사님 답
		int n[] = new int[10];
		int sum=0;
			
		for (int i = 0; i < n.length; i++) {
			int r = (int)(Math.random()*10)+1;
			n[i]=r;	//난수를 배열에 저장
			sum+=n[i];	//배열 원소의 누적합계
		}
		System.out.print("랜덤한 정수들: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
//		System.out.println();
		System.out.println("\n평균은 "+(double)sum/n.length);
		}
}


