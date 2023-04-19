package Chapter05;

class TestOne {
	void showPrint() {
		System.out.println("나는 테스트원");
	}
}

class TestTwo extends TestOne {
	
	void showPrint() {
		// super.showPrint();
		System.out.println("근데 저는 테스트 투에요");
	}
}

public class TestFile {
	public static void main(String[] args) {
		
		// new TestOne().showPrint();
		new TestTwo().showPrint();
		
	}
}
