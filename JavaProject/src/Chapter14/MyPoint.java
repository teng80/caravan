package Chapter14;

public class MyPoint {
	
	private int x, y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//객체에 toString을 오버라이딩
	@Override
	public String toString() {
		return "Point("+ x + ","+ y +")";
	}

	public static void main(String[] args) {
		//생성자 호출해서 멤버에 값 저장
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		
		//equals 메소드로 객체 자체를 비교
		//equals 메소드로 문자열은 내용 비교
		if (p.equals(q)) {
			System.out.println("같은 점");
		}else {
			System.out.println("다른 점");
		}
	}

}
