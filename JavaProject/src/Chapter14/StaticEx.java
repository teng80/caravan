package Chapter14;

import java.util.Arrays;


class ArrayUtil {
//	int[] 배열타입을 리턴 (배열2개를 복사하는 기능)
	public static int[] concat(int[] a, int[] b) {
//		배열 2개를 받고, 각각의 크기를 합친 새로운 배열이 필요함 
//		ex: int temp[] = new int[a.length + b.length]
		
//		매개변수 a[] 배열을 넣어줘야함 (a.length 만큼 , 반복)
//		ex: temp[i] = a[i];
		
//		단, a.length 길이보다 커지면 그때는 b로 받아온 배열을 넣어야함 (조건문)
//		이때, i 크기랑 b 인덱스 크기가 다르니까  ->  i - a.length 필요 (0부터)
		
		//2개의 배열을 합치는 크기 선언
		int tmp[]=new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			//첫번째 배열원소를 tmp배열에 저장
			tmp[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			//ex>a.length:4(기존 index:0~3)+0 => index=4 -> array2:3
			//ex>a.length:4+1 => index=5 -> array2:6
			//ex>a.length:4+2 => index=6 -> array2:-1
			//ex>a.length:4+3 => index=7 -> array2:-100
			//ex>a.length:4+4 => index=8 -> array2:77
			int index = a.length+i;
			tmp[index]=b[i];
		}
		return tmp;
		
	}
	public static void print(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}
}	
public class StaticEx {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}

}
