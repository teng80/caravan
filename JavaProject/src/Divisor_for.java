import java.util.Scanner;

public class Divisor_for {
/*
 * 양의 정수를 입력받아서 모든 약수를 출력
 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		int n = scanner.nextInt();
		
		System.out.println(n+"의 약수는 다음과 같습니다.");
		for (int i=1; i<=n; i++) {
			if (n%i == 0) 
				System.out.print(" "+i);
		}
	}
}
