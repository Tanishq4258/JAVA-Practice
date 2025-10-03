package Practice;
import java.util.Scanner;
public class sumOfDigits_recursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));

    }
    private static int sumOfDigits(int n){
        if(n==0) return 0;
        if(n<0){
            return -sumOfDigits(-n);
        }
        return n%10 + sumOfDigits(n/10);
    }
}
