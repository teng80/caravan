package Chapter05;
/*
 * String[] 사용
 * 메소드를 호출해서 문자열을 변경
 * to be or not to be => to eat or not to eat
 * */
public class ArrayParameterEx {
	
//	문자열 배열을 매개변수로 받아서 출력
	static void  replaceBe(String a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("be")) {
				a[i]="eat";
			}
		}
	}
	static void printStringArray(String a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String s[] = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
//		printStringArray(s[]); 오류
		printStringArray(s);
		replaceBe(s);
		printStringArray(s);
	}
}
