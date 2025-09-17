package array;

public class sum_of_rows_2d {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {3,4,5},
                {5,6,7}
        };

        for (int i =0;i<arr.length;i++){
            int sum = 0;
            for (int j =0;j<arr.length;j++) {
                sum += arr[i][j];
            }
            System.out.println("sum: " + sum);
        }

    }
}