package Chapter14;

public class teng12 {

	public static void main(String[] args) {
		String str="홍길동/장화/홍련/콩쥐/팥쥐";
		System.out.println(str);
		System.out.println();
			
		System.out.println("==========using split method============");
		String []tokens=str.split("/");
			
		for(int i=0;i<tokens.length;i++){
			System.out.println(tokens[i]);
		}

	}

}
