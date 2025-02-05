class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int floor = -1;
        int ceil = -1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == x) {
                return new int[]{arr[mid], arr[mid]};
            } else if(x < arr[mid]) {
                ceil = arr[mid];
                end = mid - 1; 
            } else {
                floor = arr[mid];
                start = mid + 1;
            }
        }
        
        return new int[]{floor, ceil};
    }
}
