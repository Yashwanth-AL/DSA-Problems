class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        int rightMax = arr[n-1];
        ArrayList<Integer> result = new ArrayList<>();
        
        result.add(rightMax);
        
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] >= rightMax) {
                result.add(arr[i]);
                rightMax = arr[i];
            }
        }
        
        Collections.reverse(result);
        return result;
        
    }
}
