package Chapter09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		int[] ArrayList = new int[4];
		int maxlength = 0;
		int index = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			names.add(scanner.nextLine());
			
			if (names.get(i).length()>maxlength) {
				maxlength = names.get(i).length();
				index = i;
			} 
		}
		for (int i = 0; i < names.size(); i++) {
			System.out.println( names.get(i) + " ");
		}
		System.out.println( " 가장 긴 이름은 : " + names.get(index) );
	
	
	}
}
