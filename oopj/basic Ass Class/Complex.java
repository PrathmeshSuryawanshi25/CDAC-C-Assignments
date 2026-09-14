public class Complex {

    int real;
    int imag;

    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Sum
    void sum(int r1, int i1) {
        System.out.println("Sum = " + (real + r1) + " + " + (imag + i1) + "i");
    }

    // Difference
    void difference(int r1, int i1) {
        System.out.println("Difference = " + (real - r1) + " + " + (imag - i1) + "i");
    }

    // Product
    void product(int r1, int i1) {
        int r = (real * r1) - (imag * i1);
        int i = (real * i1) + (imag * r1);

        System.out.println("Product = " + r + " + " + i + "i");
    }

    public static void main(String[] args) {

        System.out.print("Enter Real 1: ");
        int real = Console.getInt();

        System.out.print("Enter Imag 1: ");
        int imag = Console.getInt();

        System.out.print("Enter Real 2: ");
        int r1 = Console.getInt();

        System.out.print("Enter Imag 2: ");
        int i1 = Console.getInt();

        Complex c1 = new Complex(real, imag);

        c1.sum(r1, i1);
        c1.difference(r1, i1);
        c1.product(r1, i1);
    }
}