package Chapter13;


interface MyFuntion4{
	int calc(int x, int y);
}
public class LambdaEx4 {

	public static void main(String[] args) {
		printMultiply(3, 4, (X,Y)->X*Y);//람다식((X,Y)->X*Y)을 매개변수로 전달

	}
//	메소드 매개변수로 인터페이스 객체를 받음
//	f로 (X,Y)->X*Y 람다식 전달 받음
	static void printMultiply(int x, int y, MyFuntion4 f) {
		System.out.println(f.calc(x, y));
	}
}
