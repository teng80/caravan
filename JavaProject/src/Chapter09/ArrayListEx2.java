package Chapter09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		ArrayList<String> names = new ArrayList<String>();
//		int[] ArrayList = new int[4];
//		int maxlength = 0;
//		int index = 0;
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.print("이름을 입력하세요>>");
//			names.add(scanner.nextLine());
//			
//			if (names.get(i).length()>maxlength) {
//				maxlength = names.get(i).length();
//				index = i;
//			} 
//		}
//		for (int i = 0; i < names.size(); i++) {
//			System.out.print( names.get(i) + " ");
//		}
//		System.out.println( " 가장 긴 이름은 : " + names.get(index) );
	
	//강사님 답
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			a.add(s);
		}
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name+" ");
		}
		
		int longestIndex=0;
		for (int i = 0; i < a.size(); i++) {
			//a.get(0).length() < a.get(0).length()
			//a.get(0).length() < a.get(1).length()=>참이면 longestIndex=i
			//a.get(0 or 1).length() < a.get(2).length()=>참이면 longestIndex=i
			//a.get(0 or 1 or 2).length() < a.get(3).length()=>참이면 longestIndex=i
			if (a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.println("\n가장 긴 이름은 : "+a.get(longestIndex));
		scanner.close();
	}
}
