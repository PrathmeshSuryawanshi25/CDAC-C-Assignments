public class Employee {

    String name;
    int year;
    int salary;
    String address;

    // Constructor
    Employee(String n, int y, int s, String a) {
        name = n;
        year = y;
        salary = s;
        address = a;
    }

    // Display method
    void display() {
        System.out.println(name + "\t" + year + "\t" + address);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Robert", 1994, 50000, "64C-WallsStreet");
        Employee e2 = new Employee("Sam", 2000, 45000, "68D-WallsStreet");
        Employee e3 = new Employee("John", 1999, 55000, "26B-WallsStreet");

        System.out.println("Name\tYear of Joining\tAddress");

        e1.display();
        e2.display();
        e3.display();
    }
}