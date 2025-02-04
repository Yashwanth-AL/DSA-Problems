class Solution {
    int countSubstr(String s, int k) {
        return countAtMost(s, k) - countAtMost(s, k-1);
    }
    
    public int countAtMost(String s, int k) {
        int count = 0; 
        int left = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            map.put(current, map.getOrDefault(current, 0) + 1);
            
            while(map.size() > k) {
                char reduce = s.charAt(left);
                map.put(reduce, map.get(reduce) - 1);
                if(map.get(reduce) == 0) {
                    map.remove(reduce);
                }
                left++;
            }
            
            count += right - left + 1;
        }
        return count;
    }
}
