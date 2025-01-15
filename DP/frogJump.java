class Solution {
    int minCost(int[] height) {
        int n = height.length;
        if(n == 1) return 0;
        
        int prev = 0;
        int current = Math.abs(height[0] - height[1]);
        
        for(int i = 2; i < n; i++) {
            int one = current + Math.abs(height[i] - height[i - 1]);
            int two = prev + Math.abs(height[i] - height[i - 2]);
            int next = Math.min(one, two);
            prev = current;
            current = next;
        }
        
        return current;
        
    }
}
