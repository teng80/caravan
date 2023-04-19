
public class NestedLoop_for_for {

	public static void main(String[] args) {
		
		for(int y = 0; y < 5; y++) {	//*를 5줄로 출력
			for(int x = 0; x < 10; x++)		//*를 10개씩 출력
				System.out.print("*");
			System.out.println();
		}
	}
}

//위의 코드를 실행하면 50개의 *가 화면에 5x10의 정사각형 모양으로 출력된다.
//*를 출력하는 문장의 외부에는 두개의 for 루프가 중첩되어있다.
//외부의 for 루프는 변수y를 0에서 4까지 증가시키면서 내부의 for 루프를 실행시킨다.
//내부의 for 루프는 변수x를 0에서 9까지 증가시키면서 print()메소드를 호출한다.
//내부 for 루프가 한번 실행될 때마다 화면에는 한 줄의 *가 그려진다.
//내부 for 루프가 한 번씩 종료될 때마다 줄바꿈 문자가 화면에 출력되어 다음 줄로 넘어가게 된다.