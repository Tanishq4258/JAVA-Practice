import java.util.Scanner;
public class Sumeven{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        int sum_even = 0;
        for(int i=1; i<=N;i++){
            if(i%2==0){
                sum_even+=i;
            }
        }
        System.out.println(sum_even);
        myObj.close();
    }
}