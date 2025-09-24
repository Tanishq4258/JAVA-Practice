package Practice;

public class palindrome {
    public static void main(String[] args){
        int n=12566521, temp = n, rev=0;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        if(rev==temp){
            System.out.print("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
