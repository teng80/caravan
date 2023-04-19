package Chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{}

public class HashSetExample {
	public static void main(String[] args) {
		//set 인터페이스 컬랙션 타입으로 HashSet 클래스 객체 생성
		Set<String> set = new HashSet<String>();//upcasting
//		Set<Object> set = new HashSet<>();//upcasting
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
//		set.add("Java");//set컬렉션 중복 객체 추가 불가		
//		AA a = new AA();
//		set.add(a);
		set.add("iBatis");
		
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		Iterator<String> iterator = set.iterator();
//		Iterator<Object> iterator = set.iterator();
		while (iterator.hasNext()) { //iterator 객체 값이 있으면 
//			String element = (String)iterator.next();
			String element = iterator.next().toString();
//			set 컬렉션은 출력이 랜덤
			System.out.println("\t"+element);
		}
		set.remove("JDBC");//객체 삭제
//		System.out.println("총 객체수: "+size);
		System.out.println("총 객체수: "+set.size());
		
		for (String string : set) {//foreach문으로 컬렉션에서 객체를 가져옴
			System.out.println("\t"+string);//삭제된 객체를 빼고 출력
		}
		
		if (set.isEmpty()) {//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
		}
		set.clear();//객체 모두 삭제
		if (set.isEmpty()) {//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
		}
	}
}
