
public class Triangle {
    int a;
    int b;
    int c;


    Triangle (int a1, int b1, int c1){
        a = a1;
        b = b1;
        c = c1;
    }

    int perimeter(){
        int perimeterTri = a + b + c;
        return perimeterTri;
    }
    
    double area(){
        double s = (a+b+c)/2;
        double areaTriangle = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return areaTriangle;
        
    }
    
    public static void main(String[] args) {
       Triangle t1 = new Triangle(3, 4, 5);

       System.out.println("Perimeter = " + t1.perimeter());
       System.out.println("Area = " + t1.area());
    }
}
