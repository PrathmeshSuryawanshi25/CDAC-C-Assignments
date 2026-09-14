public class EmployeeSalary {
    int salary;
    int numOfhrs;

    void getinfo(int sal, int wHrs){
        salary = sal;
        numOfhrs = wHrs;
    }

    int totalSalary;

    int addSal(){
        if(salary < 500)
            totalSalary = salary + 10;

        return totalSalary;
    }

    int addWork(){
        if(numOfhrs > 6)
            totalSalary += 5;

        return totalSalary;
    }

    public static void main(String[] args){
        EmployeeSalary e1 = new EmployeeSalary();
        e1.getinfo(400, 7);

        System.out.println("Total Salary: ");
        System.out.println(e1.addSal());
        System.out.println(e1.addWork());

    }
}
