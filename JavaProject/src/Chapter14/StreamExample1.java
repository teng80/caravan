package Chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//ctrl+shift+o => 사용하지 않는 import정리
public class StreamExample1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println("입력데이터"+numbers);
//		스트림 생성하고 바로 리스트로 변환
//		List<Integer> result = numbers.stream().collect(Collectors.toList());
		List<Integer> result = numbers.stream()
//				filter 메소드로 짝수만 추출
				.filter(n->{return n%2 == 0;})
//				map 메소드로 전체 값들을 연산
				.map(n->{return n*n;})
				.collect(Collectors.toList());
		System.out.println("실행결과="+result);
	}
}