package Practice;

public class primeNum {
    public static void main(String[] args){
        int n = 14;
        boolean flag = true;
        if(n==1 || n==0){
            flag = false;
        }
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }

    }
}
