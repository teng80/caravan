package Chapter14;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String name = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer st = new StringTokenizer(name, "/");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
