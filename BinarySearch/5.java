class Solution {
    int median(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        int low = mat[0][0];
        int high = mat[rows - 1][cols - 1];
        
        for (int i = 0; i < rows; i++) {
            low = Math.min(low, mat[i][0]); 
            high = Math.max(high, mat[i][cols - 1]);  
        }
        
        int median = (rows * cols) / 2;
        
        while(low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            
            for(int i = 0; i < rows; i++) {
                count += upperBound(mat[i], mid);
            }
            
            if(count > median) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    private int upperBound(int[] row, int target) {
        int left = 0, right = row.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
