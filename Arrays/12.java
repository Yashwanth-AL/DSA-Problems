class RotatedArrayPairSum {
    static boolean pairInSortedRotated(int arr[], int N, int X) {
        int i;
        for (i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }
        int pivot = i + 1;
        
        // Set left to pivot (smallest element) and right to pivot - 1 (largest element)
        int left = pivot; 
        int right = pivot - 1 < 0 ? N - 1 : pivot - 1;
        
        while (left != right) {
            int sum = arr[left] + arr[right];
            
            if (sum == X) {
                return true;
            }
            
            if (sum < X) {
                left = (left + 1) % N;
            }
            else {
                right = (right - 1 + N) % N;
            }
        }
      
        return false;  
    }
