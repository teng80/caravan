package 문제연습풀이_1;

import java.util.Scanner;

public class ComputeBalance {

	public static void main(String[] args) {
		int purchaseAmount = 0; //구매금액
		int balance = 0; //청구금액
		Scanner scanner = new Scanner(System.in);
		System.out.print("구매금액을 입력하세요: ");
		purchaseAmount = scanner.nextInt();
			
		if (purchaseAmount >= 300000) {
			balance = purchaseAmount-30000;
		} else if (purchaseAmount >= 100000){
			balance = purchaseAmount-5000;
		} else {
			balance = purchaseAmount;
		}
		System.out.println("구매금액 = "+ purchaseAmount);
		System.out.println("청구금액 = "+ balance);
	}
}
