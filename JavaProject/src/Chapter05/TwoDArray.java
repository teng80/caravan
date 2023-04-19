package Chapter05;

import java.util.Random;

public class TwoDArray {
	public static void main(String[] args) {
//		int n[][] = new int[4][4];
//		
//		for (int i = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++) {
//				n[i][j] = (int)(Math.random()*10)+1;
//				System.out.print(n[i][j]+"\t");
//			}
//			System.out.println();
//		}
		//ok
		
		//강사님 답
		int intArray[][] = new int[4][4];
		
		//intArray.length : 4
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (int)(Math.random()*10)+1;
				System.out.print(intArray[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
