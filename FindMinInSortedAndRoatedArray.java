public class FindMinInSortedAndRoatedArray {
    public static void main(String[] args) {
        //int [] arr = {9,11,14,15,20,22,25,1,3,5,7};
        int [] arr = {7,8,10,15,16,2,4,6};
        System.out.println(findMin(arr));
    }
    public static int findMin(int [] arr){
        int left = 0,right = arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]<arr[right]){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
}
