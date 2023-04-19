package Chapter03;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
//		count : 3,6,9갯수
//		num : 입력받은 정수
//		a : 10의 자리
//		b : 1의 자리
		int count=0, ten, one;
		
		for (int i = 1; i < 100; i++) {
		
		ten = i/10;
		one = i%10;
		
//		3,6,9일때
		if (ten%3 == 0 && ten!=0) {
//			카운트 증가
			count++;
		}
//		3,6,9일때
		if (one%3 == 0 && one != 0) {
//			카운트 증가
			count++;
		}
		System.out.println(i);
//		if (count == 2) {
//			System.out.println(i+"박수짝짝");
//		} else if (count == 1) {
//			System.out.println(i+"박수짝");
//		} 
		}
	}
}
