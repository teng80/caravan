package Chapter05;

/*
 * 사다리꼴 면적 0.5*(아랫변+윗변)*높이 
 * 필드:아랫변, 윗변, 높이
 * */
import java.util.Scanner;

//public class Trapezoid {
//	private int down, up, height;
//
//	public Trapezoid(int down, int up, int height) {
//		this.down = down;
//		this.up = up;
//		this.height = height;
//	}
//	//계산 메소드
//	public int getArea() {
//		return (down+up)*height/2;
//	}
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print(">>");
//		int down = scanner.nextInt();
//		int up = scanner.nextInt();
//		int height = scanner.nextInt();
//		
//		Trapezoid tra = new Trapezoid(down, up, height);
//		System.out.println("사다리꼴의 면적은 "+(double)tra.getArea());
		//ok

		//강사님 답
public class Trapezoid {
	private int down, up, height;
	
	public int getArea() {
		return (down+up)*height/2;
	}
	public static void main(String[] args) {
		Trapezoid tra = new Trapezoid();//객체 생성=>생성자 호출(기본생성자 만들어서 호출<=컴파일러)
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		tra.down = scanner.nextInt();
		tra.up = scanner.nextInt();
		tra.height = scanner.nextInt();
		
		System.out.println("사다리꼴의 면적은 "+(double)tra.getArea());
		scanner.close();
	}
}

