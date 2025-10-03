package Practice;

public class diagonal_sum2d_matrix {
    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                if (j == i) {
                    sum += a[i][i];
                }
            }
        }
        System.out.println(sum);
    }
}
