import javax.swing.*;
import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        int [] arr = {5,8,9,3,2,7};
        int target = 15;
        int [] ans  =new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int secondNum = target-arr[i];
            if(map.containsKey(secondNum)){
                ans[0] = map.get(secondNum);
                ans[1] = i;
            }map.put(arr[i],i);
        }
        System.out.println(ans[0]+","+ans[1]);
    }
}

