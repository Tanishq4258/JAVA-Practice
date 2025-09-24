package Practice;

public class inverted_right_triangle {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
