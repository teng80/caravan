package 문제연습풀이;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int rNumber;
		Random generator = new Random();
		
		while (true) {
			rNumber = generator.nextInt(10)+1; //난수 발생(1~10의 정수)
			System.out.println(rNumber);
			if (rNumber==7) {
				break;
			}
		}
	}

}
