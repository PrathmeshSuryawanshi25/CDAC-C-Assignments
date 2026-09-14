public class Rectangle{
    int length;
    int bredth;

    Rectangle(int l, int b){
        length = l;
        bredth = b;
    }

    int area(){
        int area = length * bredth;
        return area;
    }
    public static void main(String[] Arg)
    {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);

        System.out.println("Area of rectangle R1 = " + r1.area());

        System.out.println("Area of rectangle R1 = " + r2.area());

        
    }
}

