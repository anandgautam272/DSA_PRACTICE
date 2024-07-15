import java.util.Scanner;

public class MajorityElements {
  public static int findMajorityElement(int [] arr,int n){
       int candidate = arr[0];
       int count = 1;
       for(int i= 1;i<n;i++){
           if(candidate == arr[i]) {
               count++;
           } else {
               count--;
           }
           if(count == 0){
               candidate = arr[i];
               count = 1;
           }
       }
       count = 0;
       for(int val : arr){
           if(val == candidate){
               count++;
           }
       }
       if(count > n/2){
           return candidate;
       }else{
           return -1;
       }
  }

    public static void main(String[] args) {

        int arr [] = {2,4,5,2,2,3,2,2,6,2,7,2,2,2};
        System.out.println(findMajorityElement(arr,arr.length));
    }
}

