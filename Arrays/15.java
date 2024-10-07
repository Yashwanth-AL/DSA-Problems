//find the kth smallest element in an array using max heap

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(k, Comparator.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            heap.add(arr[i]);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.peek();
    }
}
