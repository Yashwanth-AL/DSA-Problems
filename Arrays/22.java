class Solution {
    int maxLen(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if(sum == 0) {
                maxLength = i + 1;
            }
            
            if(map.containsKey(sum)){
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
