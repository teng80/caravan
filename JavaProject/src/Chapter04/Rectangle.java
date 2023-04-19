package Chapter04;

import java.util.Scanner;

public class Rectangle {
	int width;	//객체로 접근해서 스캐너에서 입력받은 정수가 셋팅
	int height;	//객체로 접근해서 스캐너에서 입력받은 정수가 셋팅
	public int grtArea() {	//메소드 호출하면 사각형의 넓이를 구할 수 있음
		return width*height;
	}
	
	public static void main(String[] args) {
//		new 연산자로 Rectangle 객체를 생성하면서, Rectangle 클래스 타입의 참조변수를 rect가 가리킴
		Rectangle rect = new Rectangle();	//구성: 멤버3개(멤버변수[필드]2개+멤버함수[메소드]1개)
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 "+rect.grtArea());
		scanner.close();
	}
}
