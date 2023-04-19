package Chapter05;

interface RemoteControl {
	void turnOn();
	void turnOff();
}
public class AnonymousClassTest {
	public static void main(String[] args) {
		//익명 클래스 정의(인터페이스 이름 사용 => 객체생성)
		RemoteControl ac =  new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV runOn");
			}
			@Override
			public void turnOff() {
			System.out.println("TV runOff");
			}
		 };
		 //익명 클래스 객체의 메소드 호출
		 ac.turnOn();
		 ac.turnOff();
		 }
}