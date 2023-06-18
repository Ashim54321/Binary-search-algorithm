public class CeilingOfNumber {

    // celing returns the index of smallest no greater or equals to target

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,23,34,45,56,67,78,89,90};
        int target = 24;
        System.out.println(celling(arr,target));
    }
    static int celling(int[] arr, int target){
        int start= 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
