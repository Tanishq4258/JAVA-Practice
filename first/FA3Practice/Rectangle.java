package FA3Practice;

public class Rectangle {
    double l,b;
    Rectangle(double side){l = b = side;}
    Rectangle(double l, double b){this.l = l; this.b = b;}

    double area(){return l*b;}
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5);
        Rectangle r2 = new Rectangle(4,5);
        System.out.println("Area of square is " + r1.area());
        System.out.println("Area of rectangle is " + r2.area());
    }
}
