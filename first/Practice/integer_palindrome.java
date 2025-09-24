package Practice;

public class integer_palindrome {

        public static void main(String[] args) {
            int n = 121, temp = n, rev = 0;

            while (n > 0) {
                rev = rev * 10 + (n % 10); // reverse number
                n /= 10;
            }

            if (rev == temp)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }


}
