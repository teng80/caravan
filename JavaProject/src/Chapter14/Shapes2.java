package Chapter14;

interface Shape2 {
	final double PI = 3.14;
	void draw(); //도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("---다시 그립니다.");
		draw();
	}
}
class Circle3 implements Shape2 {

	private int radius; //반지름

	public Circle3(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	@Override
	public double getArea() {
		return PI*radius*radius;
	}
}
class Oval implements Shape2 {

	private int width, height;

	public Oval(int width, int height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw() {
		System.out.println(width+"x"+height+"에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return PI*0.5*width*0.5*height;
	}
}
class Rect implements Shape2 {
	
	private int width, height;

	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형 입니다.");
	}
	@Override
	public double getArea() {
		return width*height;
	}
}

public class Shapes2 {
	public static void main(String[] args) {
		Shape2[] list = new Shape2[3]; // Shape 인터페이스 타입인 레퍼런스 배열
		list[0] = new Circle3(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}