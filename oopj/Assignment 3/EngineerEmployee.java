package in.cdac.employee;

public class EngineerEmployee extends Employee{
	private int overTime;
	
	//setter
	public void setOvertime(int eOverTime) {
		if(eOverTime > 0)
			overTime = eOverTime;
		else
			System.out.println("No OverTime occure");
		
	}
	
	public int getOverTime() {
		return overTime;
	}
	
	public EngineerEmployee(){
//		super();
//		this.name =  name;
//		this.age = age;
//		this.address = address;
//		this.gender = gender;
//		this.basicSalary = basicSalary;
//		this.overTime = overTime;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nOver Time: " + overTime; // if we didnt add super then it will only return overtime no name value, 
		// after calling super we can first call employee - superclass tostring then ours
		
	}
}
