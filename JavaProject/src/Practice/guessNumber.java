package Practice;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {

	public static void main(String[] args) {
		int numberToGuess;//사용자가 맞추려고 노력하는 숫자
		int guess; //사용하자 추측한 숫자
		Random generator = new Random();
		Scanner scanner = new Scanner(System.in);
		numberToGuess = generator.nextInt(10)+1;//난수 발생(1~10의 정수)
		System.out.print("추측한 숫자를 입력하세요: ");
		guess = scanner.nextInt();
		
		while (numberToGuess != guess) {
			System.out.println("추측한 숫자가 틀렸습니다.");
		if (numberToGuess < guess) {
			System.out.println("추측한 숫자가 큽니다.");
		} else {
			System.out.println("추측한 숫자가 작습니다.");
		}
		System.out.print("추측한 숫자를 입력하세요: ");
		guess = scanner.nextInt();
		}
		if (numberToGuess == guess) {
			System.out.println("맞추셨습니다.");
			
		}
	}

}
