package Chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 80점 이상이면 합격
 * */
public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();

//		80점 이상인 경우
		if (score >= 80) {
			System.out.println("축하합니다! 합격입니다.");
		}
		scanner.close();
	}
	
}
