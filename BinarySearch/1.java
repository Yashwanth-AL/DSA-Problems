class Solution {

    static int findFloor(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == k) return mid;
            
            else if(k > arr[mid]){
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}
