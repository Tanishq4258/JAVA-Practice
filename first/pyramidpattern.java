public class pyramidpattern{
    public static void main(String[] args){
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)+1;k++){
               if(k%2==0){
                System.out.print("* ");
            }}
            System.out.println();
        }
    }
}