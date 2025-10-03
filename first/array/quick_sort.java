package array;

public class quick_sort {
    public static void main(String[] main){
        int[] a = {2,9,4,6,8,1,5,7,3};
        quicksort(a,0,a.length - 1);
        for(int num: a){
            System.out.print(num);
        }
    }
    private static void quicksort(int[] arr, int start, int end){
        if(end<=start) return;
        int pivot = partition(arr, start, end);
        quicksort(arr, start, pivot-1);
        quicksort(arr, pivot+1, end);
    }
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j=start;j<=end-1;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
