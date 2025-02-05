class Solution {
    int countFreq(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) { 
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                int first = mid, last = mid;
                while(first > 0 && arr[first - 1] == arr[first]){
                    first--;
                }
                while(last < arr.length - 1 && arr[last + 1] == arr[last]) {
                    last++;
                }
                return last - first + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
