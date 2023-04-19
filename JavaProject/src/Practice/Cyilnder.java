package Practice;

public class Cyilnder {
	public static void main(String[] args) {
	
		double r= 7;
		double h= 5;
		double bu = volume(r, h);
		System.out.printf("둘레가 %s 고, 높이가 %s 인 원기둥이 부피는 %s 이다.", r, h, bu);
		
}
	
//	매개변수가 2개인 메소드(원기둥 부피 구하기)
	public static double volume(double radius, double height) {
//	Math.PI : Math 클래스에 PI 속성
	return Math.PI*radius*radius*height;
	}
}
