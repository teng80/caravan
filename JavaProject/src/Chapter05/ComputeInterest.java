package Chapter05;
/*
 * 정기예금의 원리금, 원금
 * 원리금=원리금*(1.0+연이율/100.0)=>1년후 원리금
 * ex>1,000,000*(1.0+5/100)=1,000,000*(1.0+0.05)=1,000,000*1.05=1,050,000
 * (현금 1백만원 일년 이자 5만원)
 * 원금, 연이율을 입력받음=>연도수 원리금 출력(1 105만원, 2 ~...)
 * 원리금이 원금의 2배를 초과할때까지 (ex>원금이 100만원이면 원리금이 200만원 초과할때 3.3% 22년~) 출력
 * */
import java.util.Scanner;

public class ComputeInterest {

	public static void main(String[] args) {
//		int principal; //원금
//		double rate; //연이율
//		double balance; //원리금
//		int years=0; //연도수
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("원금을 입력하세요: ");
//		principal = scanner.nextInt();
//		
//		System.out.print("연이율을 입력하세요: ");
//		rate = scanner.nextDouble();
//		
//		System.out.println("연도수\t원리금");
//		balance = principal;
//		
//	while (balance <= (principal*2)) {
//		balance = balance * (1.0 + rate / 100.0);
//		years = years + 1;
//		System.out.println(years+"\t"+balance);
//		}
//		System.out.println("필요한  연도수 = "+years);
		//ok
		
		//강사님 답
		int principal; //원금
		double rate; //연이율
		double balance; //원리금
		int years=0; //연도수
		Scanner scanner = new Scanner(System.in);
		System.out.print("원금을 입력하세요: ");
		principal = scanner.nextInt();
		
		System.out.print("연이율을 입력하세요: ");
		rate = scanner.nextDouble();
		balance = principal;
		
		System.out.println("\n연도수\t원리금");
		
		do {
			years++;
			balance = balance * (1.0 + rate / 100.0);//1,000,000*(1.0+5/100)
			System.out.println(years+"\t"+balance);
		} while (balance <= principal*2);
		System.out.println("\n필요한  연도수 = "+years);
		scanner.close();
	}
}
