package Practice;
import java.util.Scanner;
public class linear_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,3,2,4,4,5,3,2};
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                System.out.println(n+" Found at position "+(i+1));
            }
        }
    }
}
