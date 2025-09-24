package Practice;

public class inverted_mirror_triangle_pattern {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
