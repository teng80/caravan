package Chapter03;

public class IrregularArray {

	public static void main(String[] args) {
//		int intArray[][] = new int[4][]; 
//		
//	        intArray[0] = new int[3]; 
//	        intArray[1] = new int[2];
//	        intArray[2] = new int[3];
//	        intArray[3] = new int[2];
//		
//		for (int i = 0; i < intArray.length; i++) {
//			for (int j = 0; j < intArray[i].length; j++) {
//				intArray[i][j] = (i+1)*10+j;
//				System.out.print(intArray[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		//강사님 답
//		비정방형 배열 : 행만 정의하고 열은 비워둠
		int n[][] = new int[4][];	//4행
		n[0] = new int[3];	//1행(n[0])의 열의 크기는 3
		n[1] = new int[2];	//2행(n[0])의 열의 크기는 2
		n[2] = new int[3];	//3행(n[0])의 열의 크기는 3
		n[3] = new int[2];	//4행(n[0])의 열의 크기는 2
		
		for (int i = 0; i < n.length; i++) {	//행의 크기만큼 반복
//			3,2,3,2번 반복
			for (int j = 0; j < n[i].length; j++) {	//열의 크기만큼 반복
				n[i][j] = (i+1)*10+j;
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}
