package Chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour=3;
		int minute=5;
//		+ 할때 문자열이 하나라도 있으면 전체는 문자열이 됨
		System.out.println(hour+"시간"+minute+"분");
		
//		변수 연산해서 변수로 저장
		int totalMinute = (hour*60)+minute;
		System.out.println("총"+totalMinute+"분");
	}
}
