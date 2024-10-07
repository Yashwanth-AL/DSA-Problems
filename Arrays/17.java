public class MinMergeToPalindrome {
    public static int minMergeOperations(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mergeCount = 0;

        while (left < right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else if (arr[left] < arr[right]) {
                left++; 
                arr[left] += arr[left - 1]; 
                mergeCount++;
            } else {
                right--; 
                arr[right] += arr[right + 1]; 
                mergeCount++;
            }
        }
        
        return mergeCount;
    }
}
