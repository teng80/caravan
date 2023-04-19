package Practice;

import java.util.Scanner;

public class Trapezoid {
	
	
private int down, up, height;
	
	public Trapezoid(int down, int up, int height) {
	this.down = down;
	this.up = up;
	this.height = height;
}

	public void getArea() {
		System.out.println("사다리꼴의 면적은 "+(double)((down+up)*height/2));
		return;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		int down = scanner.nextInt();
		int up = scanner.nextInt();
		int height = scanner.nextInt();
		Trapezoid t = new Trapezoid(down, up, height);
		t.getArea();
	}
}
