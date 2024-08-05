package ArrayProblem;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scn.nextInt();
        }
        reverseArray(a);
    }
    public static void reverseArray(int [] arr){
          int n = arr.length;
          for(int i=n-1;i>=0;i--)
              System.out.print(arr[i] + " ");
    }
}
