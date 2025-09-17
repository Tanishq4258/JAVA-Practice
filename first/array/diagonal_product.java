package array;

public class diagonal_product {
    public static void main(String[] args){
        int[][] arr = {
                {2,3,4},
                {5,6,7},
                {8,7,6}
        };
        int product = 1;
        for (int i =0;i<arr.length;i++){
            product *= arr[i][i];
        }
        System.out.println(product);
    }
}