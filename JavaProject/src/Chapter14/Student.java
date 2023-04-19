package Chapter14;

public class Student {
	
//	public String Name;
//	public int Number;
//	public String Department;
//	
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
//	public int getNumber() {
//		return Number;
//	}
//	public void setNumber(int number) {
//		Number = number;
//	}
//	public String getDepartment() {
//		return Department;
//	}
//	public void setDepartment(String department) {
//		Department = department;
//	}
//	public String toString() {
//		return "이름: "+Name+"\n"+"학번: "+Number+"\n"+"소속학과: "+Department;
		//ok
		
		//강사님 답

	public String Name; //4.갑돌
	public int Number;
	public String Department;
	
	@Override
	public String toString() {
		return "이름: "+Name+"\n"+"학번: "+Number+"\n"+"소속학과: "+Department;
	}
	public String getName() {
		return Name;
	}
	//2.갑돌
	public void setName(String name) {
		Name = name; //3.갑돌
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
		
	
	
}	

