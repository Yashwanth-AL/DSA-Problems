class Solution {
    static boolean searchInSorted(int arr[], int k) {
        return binarySearch(arr, 0, arr.length - 1, k);
    }
    
    public static boolean binarySearch(int arr[], int start, int end, int key) {
        
        if(start > end) return false;
        
        int mid = start + (end - start) / 2;
        
        if(arr[mid] == key) return true;
        
        else if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, end, key);
        } else {
            return binarySearch(arr, start, mid - 1, key);
        }
    }
}
