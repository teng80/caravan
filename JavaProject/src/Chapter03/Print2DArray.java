package Chapter03;

public class Print2DArray {

	public static void main(String[] args) {
		
//		int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
//
//		for (int i = 0; i < n.length; i++) {
//			int[] intArray = n[i];
//			for (int j = 0; j < n[i].length; j++) {
//				System.out.print(intArray[j]);
//			}
//			System.out.println();
//		}

		//강사님 답
//		열의 크기가 각각 달라서 비정방형 배열
		int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
//		n.length : 5(행의 크기) => 중괄호 안에 중괄호 갯수
		for (int i = 0; i < n.length; i++) {
//			n[0].length=1;
//			n[1].length=3;
//			...
//			n[4].length=2;
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
