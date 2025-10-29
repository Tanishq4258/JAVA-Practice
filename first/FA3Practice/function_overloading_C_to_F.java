package FA3Practice;

public class function_overloading_C_to_F {
    public static void main(String[] args){
        Temp t1 = new Temp(37.0);
        Temp t2 = new Temp(98);
    }

}
class Temp{
    double temp;
    Temp(double celsius){
        temp = (celsius*9/5) + 32;
        System.out.println("Temp in Fahrenheit is" + temp);
    }
    Temp(int fahrenheit){
        temp = (fahrenheit - 32)*5/9;
        System.out.println("Temp in Celsius is" + temp);
    }
}
