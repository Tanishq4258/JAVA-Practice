package Practice;

public class mirror_right_triangle_pattern {
    public static void main(String[] args){
    int n=4;
    for(int i=0;i<n;i++){
        for(int j=n-i-1;j>=0;j--){
            System.out.print("  ");
        }
        for(int k=0;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }}
}
