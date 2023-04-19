package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {

	public static void main(String[] args) {
//		int n[] = new int[10];
//		int numberToGuess=0;
//		int guess=0;
//		Scanner scanner = new Scanner(System.in);
//		
//		for (int i = 0; i < n.length; i++) {
//			System.out.print("추측한 숫자를 입력하세요: ");
//			n[i] = (int)(Math.random()*10)+1;
//			guess = scanner.nextInt();
//			if (n[i]==guess) {
//				System.out.println("맞추셨습니다.");
//				break;
//			} else if (n[i]>guess) {
//				System.out.println("추측한 숫자가 틀렸습니다.");
//				System.out.println("추측한 숫자가 너무 큽니다.");
//				
//			} else {
//				System.out.println("추측한 숫자가 틀렸습니다.");
//				System.out.println("추측한 숫자가 너무 작습니다.");
//			}
//		}
			
			//강사님 답
		int numberToGuess;
		int guess;
		Random generator = new Random();
		Scanner scanner = new Scanner(System.in);
		numberToGuess = generator.nextInt(10)+1;
		System.out.println("추측한 숫자를 입력하세요: ");
		guess = scanner.nextInt();
		
		while (guess != numberToGuess) {
			System.out.println("추측된 숫자가 틀렸습니다.");
			if (guess > numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			} else {
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
			System.out.println("추측한 숫자를 입력하세요: ");
			guess = scanner.nextInt();
		}
		System.out.println("맞추셨습니다.");
		scanner.close();
	}

}
