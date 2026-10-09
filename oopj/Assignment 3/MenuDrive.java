package in.cdac.employee;

public class MenuDrive extends Employee{
	public static void main(String[] args) {
		Employee obj;
		final int ADD_MANAGER = 1;
		final int ADD_ENGINEER = 2;
		final int ADD_SALESPEARSON = 3;
		
		
//		int selectMode = ConsoleInput.getInt();
//		int choice = ConsoleInput.getInt();
		int i = 0;
		int count = 0;
		Employee empArr[] = new Employee[50];
		//Employee allManager = empArr[0];
		
		do {
			
			
			System.out.println("1 = Add Employee Details, \n2 = Display the Employees Details, \n3 = Sort the Employees List");
			switch (ConsoleInput.getInt()) {
			case 1 ->{
				
				System.out.println("Enter the choice \n1 = Add Manager \n2= Add Engineer \n3= Add Sales Person");
				int choice = ConsoleInput.getInt();
				
				if(choice == ADD_MANAGER) {
					obj = new ManagerEmployee();
					System.out.println("set the Rate of hra");
					((ManagerEmployee)obj).setHRA(ConsoleInput.getFloat());
					System.out.println("This is Manager");
					empArr[count++] = obj;
					
				}else if(choice == ADD_ENGINEER) {
					obj = new EngineerEmployee();
					System.out.println("set the Overtimehrs");
					((EngineerEmployee)obj).setOvertime(ConsoleInput.getInt());
					System.out.println("This is Engineer");
					empArr[count++] = obj;
					
				}else if(choice == ADD_SALESPEARSON) {
					obj = new SalesPersonEmployee();
					System.out.println("set the commision");
					((SalesPersonEmployee)obj).setCommision(ConsoleInput.getFloat());
					System.out.println("This is Sales Person");
					empArr[count++] = obj;
				}else {
					System.out.println("Invalid Choice");
					return;
					}
				
				
				System.out.println("Enter the name");
				String name = ConsoleInput.getString();
				obj.setName(name);
				
				System.out.println("Enter the age");
				int age = ConsoleInput.getInt();
				obj.setAge(age);
				
				System.out.println("Enter the address");
				String address = ConsoleInput.getString();
				obj.setAddress(address);
				
				System.out.println("Enter the Gender");
				String gender = ConsoleInput.getString();
				obj.setGender(gender);
				
				System.out.println("Set the basic Salary");
				obj.setBasicSalary(ConsoleInput.getInt());
				
				
			}
			
			case 2 -> {
				
			
				
				for(int icnt = 0; icnt < count; icnt++) {
						System.out.println(empArr[icnt].toString());
						System.out.println("");
				}
				
//				System.out.println("The Added Employees are: ");
//				System.out.println("Name: "+eObj.getName());
//				System.out.println("Age: " + eObj.getAge());
//				System.out.println("Address: " + eObj.getAddress());
//				System.out.println("Gender: " + eObj.getGender());
//				System.out.println("Basic Salary: " + eObj.getBasicSalary());
				
				
			}
			
			case 3 -> {
				
				System.out.println("Sort \n1 = Manager - Engineer - SalesPersons \n2 = By name Ascending Order \n3 = By name Descenting Order");
				int selectSorting = ConsoleInput.getInt();
				
				switch(selectSorting) {
				case 1 -> {
					
					System.out.println("The Added Managers List is: ");
					for(int icnt = 0; icnt < count; icnt++) {
						if(empArr[icnt] instanceof ManagerEmployee) {
							System.out.println(empArr[icnt].toString());
							System.out.println();
						}
					}
					
					System.out.println("The Added Engineers are: ");
					for(int icnt = 0; icnt < count; icnt++) {
						if(empArr[icnt] instanceof EngineerEmployee) {
							System.out.println(empArr[icnt].toString());
							System.out.println();
						}
					}
					
					System.out.println("The Added Sales Persons are: ");
					for(int icnt = 0; icnt < count; icnt++) {
						if(empArr[icnt] instanceof SalesPersonEmployee) {
							System.out.println(empArr[icnt].toString());
							System.out.println();
						}
					}
				}
				
				case 2 -> {
					for(int icnt = 0; icnt < count - 1; icnt++) {
						for(int jcnt = 1; jcnt < count; jcnt++) {
							if(empArr[icnt].getName().compareTo(empArr[jcnt].getName()) < 0) {
								Employee temp = empArr[icnt];
								empArr[icnt] = empArr[jcnt];
								empArr[jcnt] = temp;
								//System.out.println(empArr[icnt].toString());
							}
						}
					}
				}
				}
				
			}
		}
		}while(i < 3);
	
	}

}
