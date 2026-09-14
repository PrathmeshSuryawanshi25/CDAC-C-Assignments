class Student {
    String name;
    int roll_no;
    String phone_no;
    String address;
}

public class Main {
    public static void main(String[] args) {

        
        Student s1 = new Student();
        s1.name = "John";
        s1.roll_no = 2;

        System.out.println("Name : " + s1.name);
        System.out.println("Roll No : " + s1.roll_no);


        Student sam = new Student();
        sam.name = "Sam";
        sam.roll_no = 1;
        sam.phone_no = "9876543210";
        sam.address = "Nashik";

        Student john = new Student();
        john.name = "John";
        john.roll_no = 2;
        john.phone_no = "9123456789";
        john.address = "Mumbai";

        System.out.println("\nPart B");

        System.out.println("Name : " + sam.name);
        System.out.println("Roll No : " + sam.roll_no);
        System.out.println("Phone : " + sam.phone_no);
        System.out.println("Address : " + sam.address);

        System.out.println();

        System.out.println("Name : " + john.name);
        System.out.println("Roll No : " + john.roll_no);
        System.out.println("Phone : " + john.phone_no);
        System.out.println("Address : " + john.address);
    }
}