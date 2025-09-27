package Practice;

public class insertionInArray {
    public static void main(String[] main){
        int[] arr = {1,2,3,4,5,0};
        int n = arr.length-1;
        int pos = 3;
        int value = 7;
        for(int i=n;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
        n++;
    }
}
