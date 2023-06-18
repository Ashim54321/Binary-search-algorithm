public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,23,34,45,56,67,78,89,90};
        int[]arr ={90,89,78,56,23,12};
        int target = 23;
        System.out.println(orderAgnosticBs(arr,target));
    }
    static int orderAgnosticBs(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsd =  arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if(isAsd) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
