class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int big = arr[0];
        
        for(int i = 0; i < n; i++){
            if(arr[i] > big){
                big = arr[i];
            }
        }
        
        int secondBig = -1;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > secondBig && arr[i] != big){
                secondBig = arr[i];
            }
        }
        return secondBig;
    }
}
