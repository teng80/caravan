package Chapter14;

import java.util.Random;

public class KimTaeHyung_0427 {

	public static void main(String[] args) {
		int intArray[][]=new int[3][4];
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (int)(Math.random()*9+1);
				sum+=intArray[i][j];
				}
			}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j]+"\t");
				}
			System.out.println(" ");
			}
			System.out.println("합은 "+sum);
		}
	}
