package Chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 8; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//스트림생성
		Stream<Integer> myStream = list.stream();
		//중간연산이 filter나 map
		//마지막 연산이 forEach
		myStream.filter(s->(s>=5)).forEach(n->System.out.println(n));
		//스트림 연산하더라도 list 원 데이터는 변하지 않음 
		System.out.println(list);
	}
}
