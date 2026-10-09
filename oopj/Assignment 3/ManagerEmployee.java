package in.cdac.employee;

public class ManagerEmployee extends Employee {
	private float hra;
	
	//setter
	public void setHRA(float mHRA) {
		hra = mHRA;
	}
	
	//getter
	public float getHRA() {
		return hra;
	}
	
	public ManagerEmployee(){
//		super();
//		this.name =  name;
//		this.age = age;
//		this.address = address;
//		this.gender = gender;
//		this.basicSalary = basicSalary;
//		this.hra  = hra;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nhra: " + hra;
	}
}
