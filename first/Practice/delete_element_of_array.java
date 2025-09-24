package Practice;

public class delete_element_of_array {

        public static void main(String[] args) {
            int arr[] = {10, 20, 30, 40, 50};
            int pos = 2; // delete element at index 2 (30)

            // Left Shift
            for (int i = pos; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0; // last element empty

            System.out.print("After deletion: ");
            for(int i=0;i<arr.length-1;i++){
                System.out.print(arr[i]);
                System.out.print(' ');
            }
        }
}
