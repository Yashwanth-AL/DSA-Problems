class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        int n = arr.length;
        int maxScore = 0;
        
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        
        for(int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            
            right[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        
        for(int i = 0; i < n; i++) {
            int min = Integer.MIN_VALUE;
            
            if(left[i] != -1){
                min = Math.max(min, arr[left[i]]);
            }
            
            if(right[i] != -1){
                min = Math.max(min, arr[right[i]]);
            }
            
            if(min != Integer.MIN_VALUE){
                maxScore = Math.max(maxScore, min + arr[i]);
            }   
        }
        
        return maxScore;
    }
}
