package Chapter13;

interface MyFuntion3{
	void print();
}
public class LambdaEx3 {
	public static void main(String[] args) {
		MyFuntion3 f=()->{System.out.println("Hello");};//람다식 작성
		f.print();//람다식 호출
		f=()->System.out.println("안녕");//람다식 재작성
		f.print();//람다식 호출
		
	}
}
