package Chapter03;
/*
 * 문자열을 정수로 변환
 * 변환안될때를 대비에서 예외처리
 * */
public class NumberFormatException {

	public static void main(String[] args) {
		String[] stringsNumber = {"23","12","3.141592","998"};
		int i;
		
		for (i = 0; i < stringsNumber.length; i++) {
//			문자열을 정수로 받을때 오류
//			int j = stringsNumber[i];
//			string 변수로 받을수있음
//			String j = stringsNumber[i];
//			parseInt : 문자열을 정수로 변환하는 메소드
//			NumberFormatException: For input string: "3.141592"
			try {
				int j = Integer.parseInt(stringsNumber[i]);
				System.out.println("숫자로 변환된 값은 "+j);
			} catch (Exception e) {
				System.out.println(stringsNumber[i]+"는 정수로 변환할 수 없습니다.");
			}
		}
	}
}
