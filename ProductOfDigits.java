import java.util.Scanner;

public class ProductOfDigits {
    public static int smallestNumber(int n){
       String ans = "";
       int div;
        for(div = 9;div>=2;div--){
            while(n % div ==0){
                n= n / div;
                ans=div + ans;
            }
        }
        if(n!=1){
            return -1;
        }else{
            return Integer.parseInt(ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(smallestNumber(n));
    }
}
