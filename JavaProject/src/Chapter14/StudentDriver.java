package Chapter14;

public class StudentDriver {

	public static void main(String[] args) {
//		Student student1, student2;
//		
//		student1 = new Student();
//		student1.Name="갑돌";
//		student1.Number=100 ;
//		student1.Department="컴퓨터공학과";
//		System.out.println(student1.toString());
//		
//		student2 = new Student();
//		student2.Name="갑순";
//		student2.Number=200 ;
//		student2.Department="건축학과";
//		System.out.println(student2.toString());
//		
//		student2.setDepartment("수학과");
//		System.out.println(student2.toString());
		//ok
		
		//강사님 답
		Student student1, student2;
		student1 = new Student();
		student1.setName("갑돌");//1.갑돌
		student1.setNumber(100);
		student1.setDepartment("컴퓨터공학과");
		//toString() 메소드가 생략됨
//		System.out.println(student1);
		System.out.println(student1.toString());
		
		student2 = new Student();
		student2.setName("갑순");
		student2.setNumber(200);
		student2.setDepartment("건축학과");
		System.out.println(student2.toString());
		
		student2.setDepartment("수학과");
		System.out.println(student2.toString());
		
	}
}
