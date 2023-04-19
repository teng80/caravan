package Chapter14;

/*
 * 성과 이름의 속성을 가진다.
 * */
public class Person {
//	멤버변수2개
	public String lastName;
	public String firstName;
//	alt+shift+s => 셀렉트 게터스
//	멤버함수2개
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getLength() {
		return lastName.length()+firstName.length();
	}
}	
	



