package Chapter14;

import java.util.Scanner;

class Add{
	private int a,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a+b;
	}
}
class Sub{
	private int a,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a-b;
	}
}
class Mul{
	private int a,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a*b;
	}
}
class Div{
	private int a,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		int res=0;
		try {
			res=a/b;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return res;
	}
}
public class Calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operator = scanner.next().charAt(0);//연산자를 문자로 변환
		
		switch (operator) {
		case '+':
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;

		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
			
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
			
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
			
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		scanner.close();
	}
}
