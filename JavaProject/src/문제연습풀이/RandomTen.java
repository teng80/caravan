package 문제연습풀이;

import java.util.Random;

public class RandomTen {

	public static void main(String[] args) {
		int n[] = new int[10];
		int sum=0;
		Random generator = new Random();
		System.out.print("랜덤한 정수들 :");
		for (int i = 0; i < n.length; i++) {
			n[i] = generator.nextInt(10)+1;
			System.out.print(" " + n[i]);
			sum += n[i];
		}
		System.out.println();
		System.out.println("평균은 "+(double)sum/n.length);
	}

}
