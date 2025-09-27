package Practice;

public class delete_element_in_array_rightShift {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int pos = 2;
        for(int i=pos;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = 0;
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i] + " " +
                    "");
        }
    }
}
