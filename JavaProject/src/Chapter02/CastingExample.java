package Chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue=44032;
//		int 타입을 char 로 바로 저장하려고 하면 오류
//		char charValue=intValue;
//		char 로 변환(casting)해서 저장
//		44032 유니코드에 해당하는 '가'문자가 저장
		char charValue=(char) intValue;
		System.out.println(charValue);
		
//		정수 작은타입에서 큰타입으로 변환(자동 변환->묵시적 변환)
//		long longValue=500;
//		5000999888L 에서 L을 안붙이면 int로 인식해서 오류
		long longValue=5000999888L;
//		정수 큰타입에서 작은 타입으로 변환(변환 안하면 오류)
//		long 숫자가 int로 변활할때 잘려서 706032592로 저장
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue=3.14;
//		실수에서 정수로 변환(변환 안하면 오류)
//		3.14에서 소수점이 잘려서 3으로 저장
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		
	}
}
