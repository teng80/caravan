package Chapter03;

public class Gugudan {

	public static void main(String[] args) {
//		구구단 : 이중 for 문
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
//				System.out.println("@@@### i=>>"+i);
//				System.out.println("@@@### j=>>"+j);
				System.out.print(i + "x" + j + "=" + i * j + "");
//				탭으로 띄워서 정렬
				System.out.print("\t");
			}	
//			단이 끝날때마다 엔터
			System.out.println();
		}
	}
}
