package Practice;

public class Square {
//	void: 리턴타입(리턴할 것이 없다)
	public static void main(String[] args) {
		
		int n = 4;
//		n의 제곱을 s로 저장
		int s = squre(n);
		System.out.println("한 변의 길이가 "+n+"인 정사각형의 넓이 : "+s);
//		return; 오류 발생은 안함()
	}
//	squre : 메소드명
//		public static int squre() {} int 타입 선언 후 return값 없어서 오류남
	
//	int length : int 타입의 매개 변수(인자, 파라미터)
		public static int squre(int length) {
			return length * length; //간단한 경우 바로 리턴을 해주고 (매개 변수로 받은 값을 제곱해서 반
//			return 0; // 수식이 복잡해지면 리턴값을 주고 수식 만들어 줌.
		}// return type이 void가 아닐 경우 리턴 값이 있어야함.
	
		
}

