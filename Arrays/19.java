class Solution {
    int longSubarrWthSumDivByK(int a[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int maxLength = 0;
        int prefixSum = 0;
        
        for(int i = 0; i < n; i++){
            prefixSum += a[i];
            
            int remainder = prefixSum % k;
            if(remainder < 0) {
                remainder += k;
            }
            
            if(map.containsKey(remainder)) {
                int length = i - map.get(remainder);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(remainder, i);
            }
        }
        return maxLength;
    }
}
