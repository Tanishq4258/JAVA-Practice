package Patterns;

public class inverted2triangle {
    public static void main(String[] args){
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=n;j>=i;j--){
                if(j!=0){
                    System.out.print(" ");
                }
            }
            for(int k=i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
