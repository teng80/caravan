package Chapter02;

public class RandomNumber {
	public static void main(String[] args) {
//		타입 불일치로 오류	
//		String n = rollDie();
//		리턴타입과 받는 변수 타입이 일치해야 함
		int n = rollDie();
		System.out.println("주사위의 눈: "+n);				
	}
//	매개변수가 없는 메소드(주사위의 숫자 구하기 1~6)
	public static int rollDie() {
//		random() : 0이상 1미만 난수 발생
//		Math.random();
//		random() : 0이상 6미만 난수 발생(소수점)		
		double x = 6 * Math.random();
//		0~5의 난수
		int temp = (int)x;
//		1~6의 난수
		return temp +1;
	}
}
