package Chapter12;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest2 {

	public static void main(String[] args) {
		String[] a = {"a","b","c","d"};
		int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		System.out.println(Arrays.asList(a));//List로 
		
		Arrays.sort(b,4,14);//인덱스 정렬(4~13)
		System.out.println(Arrays.toString(b));//string으로
		
		Arrays.sort(b);//오름차순 정렬
		System.out.println(Arrays.toString(b));//string으로
		
		Arrays.sort(a, Collections.reverseOrder());//문자열을 거꾸로
		System.out.println(Arrays.toString(a));//string으로
		
		Arrays.sort(a);//오름차순 정렬
		System.out.println(Arrays.toString(a));//string으로
		
		Arrays.sort(a,2,4,Collections.reverseOrder());//
		System.out.println(Arrays.toString(a));//string으로
		
		String[] cc= {"11","12","13","23","53","223","145","53"};
		Arrays.sort(cc, Collections.reverseOrder());
		System.out.println(Arrays.toString(cc));//string으로
		
		int[] c = Arrays.copyOf(b, b.length);//배열객체를 복사
		System.out.println(Arrays.toString(c));//string으로
		
		String[] d = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(d));//string으로
		
	}
}
