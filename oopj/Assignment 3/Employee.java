package in.cdac.employee;

public class Employee {
	protected String name;
	protected int age;
	protected String address;
	protected String gender;
	protected int basicSalary;
	
	//setter
	public void setName(String eName){
		name = eName;
	}
	
	public void setAge(int eAge) {
		age = eAge;
	}
	
	public void setAddress(String eAddress) {
		address = eAddress;
	}
	
	public void setGender(String eGender) {
		gender = eGender;
	}
	
	public void setBasicSalary(int eBasicSalary) {
		if(eBasicSalary > 0) 
			basicSalary = eBasicSalary;
		else
			System.out.println("Invalid Amount - Request Denied");
	}
	
	//getters
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getBasicSalary() {
		return basicSalary;
	}
		
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nGender: " + gender + "\nBasic Salary: " + basicSalary;
	}
	
	
}



