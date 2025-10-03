package Practice;
import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toDecimal(n));

    }
    private static int toDecimal(int n){
        if(n == 0) return 0;
        return (n%10) + 2*toDecimal(n/10);
    }
}
