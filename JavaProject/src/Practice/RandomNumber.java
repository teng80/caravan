package Practice;

public class RandomNumber {
	public static void main(String[] args) {
		//타입 불일치로 오류
//		String n = rollDie(); 리턴타입과 받는 변수의 타입을 일치시켜주어야함.
		int n = rollDie();
		System.out.println("주사위의 눈: "+n);
	}
	// 매개변수가 없는 메소드(주사위의 숫자 구하기) 
	public static int rollDie() {
		int x = (int)((Math.random()*6)+1); //방법1
		return x;
		
//방법2		double x = 6*Math.random();
////		0~5의 난수 
//		int temp = (int)x;
////		1~6의 난수를 반환
//		return temp+1;
		
		
	}
}
