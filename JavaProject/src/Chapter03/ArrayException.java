package Chapter03;

/*
 * 예외처리
 * 배열 인덱스 벗어나는 것
 * */
public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		
//		0
//		1
//		3
//		6
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//			at Chapter03.ArrayException.main(ArrayException.java:14)
		
//		예외가 발생될수 있기에 예외처리
		System.out.println("크기 : " + intArray.length);
		try {
//			i값이 0~4
			for (int i = 0; i < intArray.length; i++) {
//				0+1+0 => intArray[1]=1; i=0
//				1+1+1 => intArray[2]=3; i=1
//				2+1+3 => intArray[3]=6; i=2
//				3+1+6 => intArray[4]=10; i=3
//				4+1+10 => intArray[5]=15; i=4
				intArray[i+1] = intArray[i]+i+1; // 인덱스 1부터 값을 넣고
				System.out.println(
						"index[" + i + "]" + intArray[i]); // 츌력은 인덱스 0부터 시작함
			}
			
//		} catch (Exception e) { //예외처리 종류 상관없이 다 처리(실무에서 많이 사용)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위가 벗어났습니다.");
		}
		
	}
}
