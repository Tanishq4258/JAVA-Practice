package Practice;

public class prime_btw_2nums {
    public static void main(String[] args){
        int num1=5,num2=20;

        for(int i=num1;i<=num2;i++){
            boolean flag=true;
                if(i<2) continue;
                for(int j=2;j<i/2;j++) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }
            if(flag){
                System.out.println(i);
            }

        }
    }
}
