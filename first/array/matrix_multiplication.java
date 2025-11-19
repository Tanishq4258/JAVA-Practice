package array;

public class matrix_multiplication {
    class Main {
        static void multiplyMatrix(int A[][], int B[][], int R1, int R2, int C1, int C2)

        public static void main(String[] args) {
            Result result = new Result();
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while(t-- > 0) {
                int r1 = in.nextInt();
                int c1 = in.nextInt();
                int[][] A = new int[r1][c1];
                for(int i = 0;i<r1;i++){
                    for(int j = 0;j<c1;j++){
                        A[i][j] = in.nextInt();
                    }
                }
                int r2 = in.nextInt();
                int c2 = in.nextInt();
                int[][] B = new int[r2][c2];
                for(int i = 0;i<r2;i++){
                    for(int j = 0;j<c2;j++){
                        B[i][j] = in.nextInt();
                    }
                }
                result.multiplyMatrix(A,B,r1,c1,r2,c2);
            }
        }
    }
}
