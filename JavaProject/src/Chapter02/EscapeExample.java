package Chapter02;

public class EscapeExample {
	public static void main(String[] args) {
//		백슬래시t : 탭만큼 띄움
		System.out.println("번호\t이름\t직업");
//		백슬래시n : 엔터(다음행)
		System.out.println("번호\t이름\t직업\n");
		System.out.println("번호\t이름\t직업");
//		큰따옴표 출력시 백슬래시 필요
		System.out.println("우리는 \"개발자\" 입니다.");
//		백슬래시 출력시 백슬래시 필요
		System.out.println("봄\\여름\\가을\\겨울");
	}
}
