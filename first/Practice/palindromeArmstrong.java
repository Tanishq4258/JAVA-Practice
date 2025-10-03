package Practice;

public class palindromeArmstrong {
    public static void main(String[] main){
        int num=1221;
        if(palindrome(num)){
            System.out.println("Palindrome");
        }
        if(armstrong(num)){
            System.out.println("Armstrong");
        }
    }
    public static boolean palindrome(int num){
        int temp = num, rev = 0;
        while(num>0){
            rev = rev * 10 + (num%10);
            num/=10;
        }
        return temp==rev;
    }

    public static boolean armstrong(int num){
        int temp2 = num, sum=0, count=0;
        while(temp2!=0){
            temp2/=10;
            count++;
        }
        while(num>0){
            sum+= (int)Math.pow(temp2,count);
            num/=10;
        }
        if(temp2 == sum){
            return true;
        }
        else return false;

    }

}
