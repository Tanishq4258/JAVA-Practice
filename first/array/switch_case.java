package array;
import java.util.*;
public class switch_case {


        public static void main(String[] args) {
            int i = 1, j = -1;
            switch (i) {
                case 0, 1: j = 1; break;
                case 2: j = 2; break;
                default: j = 0;
            }
            System.out.println("j = " + j);
        }
    }

