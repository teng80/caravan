package Practice;

import java.util.Scanner;

/*
 * 점수를 입력받아서 80점 이상이면 합격
 */
public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int scores = sc.nextInt();
		
		
		if (scores >= 80) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
}
