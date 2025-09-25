package Practice;

public class frequency_recursion {
    static int freq(int[] arr, int n, int x){
        if(n==0 ) return 0;
        if(arr[n-1]==x) return 1+freq(arr,n-1,x);
        else return freq(arr,n-1,x);
    }
    public static void main(String[] ags){
        int[] arr = {1,2,3,1,2,5,1,2,3};
        int x=3;
        System.out.println("Frequency of " + x + " is " + freq(arr, arr.length, x));
    }
}
