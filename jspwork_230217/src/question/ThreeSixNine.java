package question;

import java.util.Scanner;

public class ThreeSixNine {
	private int num;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public String process() {
		String result="";
		//count : 3,6,9갯수
		//num : 입력받은 정수
		//a : 10의 자리
		//b : 1의 자리
		int a;
		int b;
		int count=0;
		a = num/10;
		b = num%10;
		//3,6,9일때
		if (a%3 == 0) { //a를 3으로 나눈 나머지가 0과 같다
			//카운트 증가
			count++;
		}
		//3,6,9일때
		if (b%3 == 0 && b != 0) { //b를 3으로 나눈 나머지가 0과 같다 그리고 b는 0이 아니다 
			//카운트 증가
			count++;
		}
		if (count == 2) {
			result = "박수짝짝";
		} else if (count == 1) {
			result = "박수짝";
		} else {
			result = "박수 없음";
		}
		return result;
	}
}


