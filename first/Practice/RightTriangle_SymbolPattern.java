package Practice;

public class RightTriangle_SymbolPattern {
        public static void main(String[] args) {
            int n = 5;
            char[] symbols = {'@', '*', '#'};
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(symbols[j % 3] + " ");
                }
                System.out.println();
            }

    }
}
