package Practice;

public class number_pyramid {
    public static void main(String[] main) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int k = i - 1; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
