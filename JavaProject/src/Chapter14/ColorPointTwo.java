package Chapter14;

public class ColorPointTwo extends Point {
	String color;
	//2.생성자 ColorPointTwo() 호출
	public ColorPointTwo() {
		//3.생성자 ColorPointTwo(int x, int y) 호출
		this(0, 0);
	}
	//4. 0,0
	public ColorPointTwo(int x, int y) {
		super(x, y);
		color = "BLACK";
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		 return color+"색의 ("+getX()+","+getY()+")의 점";
	}
	
	public static void main(String[] args) {
		//1.생성자 ColorPointTwo() 호출
		ColorPointTwo zeroPoint = new ColorPointTwo(); // BLACK 색에 (0,0) 위치의 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPointTwo cp = new ColorPointTwo(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
