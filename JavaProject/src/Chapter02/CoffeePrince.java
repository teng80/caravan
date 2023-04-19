package Chapter02;

import java.util.Scanner;

/*
 * 커피 주문을 받아서 커피명과 가격을 출력
 * */
public class CoffeePrince {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("무슨 커피 드릴까요? ");
//		next() : 문자열 입력받는 메소드
		String order = scanner.next();
//		커피가격 변수선언
		int price = 0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		case "아메리카노":
			price=2000;
			break;

		default:
			System.out.println("메뉴에 없습니다!");
			break;
		}
		if (price !=0) {
			System.out.println(order+"는"+price+"원입니다.");			
		}
		scanner.close();
		
	}
}
