class Solution {
    void nextPermutation(int[] arr) {
        
        int pivot;
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i] > arr[i-1]){
                pivot = i-1;
                for(int j = arr.length - 1; j > i-1; j--){
                    if(arr[j] > arr[pivot]){
                        int temp = arr[j];
                        arr[j] = arr[pivot];
                        arr[pivot] = temp;
                        reverse(arr, pivot+1, arr.length-1);
                        return;
                    }
                }
            }
        }
        reverse(arr, 0, arr.length-1);
        
    }
    
    
    void reverse(int arr[], int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
   
}
