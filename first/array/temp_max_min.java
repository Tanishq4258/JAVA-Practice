package array;

public class temp_max_min {
    public static void main(String[] args){
        int[] temp = {20,19,22,21,18,22,23};
        int max = temp[0];
        int min = temp[1];
        for(int i=0;i<temp.length;i++){
            if(max < temp[i]){
                max = temp[i];
            }
            if(min > temp[i]){
                min = temp[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
