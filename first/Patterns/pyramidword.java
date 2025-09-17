package Patterns;

public class pyramidword {
    public static void main(String[] args){
        String str[]={"I","N","T","E","L","L","I","J"};
        int n = str.length;
//        System.out.println(n);
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(str[j]);
            }
            System.out.println();
        }
    }
}
