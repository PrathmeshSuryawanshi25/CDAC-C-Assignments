package in.cdac.employee;

public class SalesPersonEmployee extends Employee {
	private float commision;
	
	//setter
	public void setCommision(float sCommision) {
		commision = sCommision;
	}
	
	//getter
	public float getCommision() {
		return commision;
	}
	
	SalesPersonEmployee(){
		//super();
//		this.name =  name;
//		this.age = age;
//		this.address = address;
//		this.gender = gender;
//		this.basicSalary = basicSalary;
		//this.commision = commision;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCommision: " + commision;
	}
}
