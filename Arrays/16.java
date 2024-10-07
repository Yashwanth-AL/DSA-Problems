// Merge Overlapping Intervals
// Given a set of time intervals in any order, our task is to merge all overlapping intervals into one and output the result which should have only mutually exclusive intervals.

// Example:

// Input: arr = {{1,3},{2,4},{6,8},{9,10}}
// Output: {{1, 4}, {6, 8}, {9, 10}}
// Explanation: Given intervals: [1,3],[2,4],[6,8],[9,10], we have only two overlapping intervals here,[1,3] and [2,4]. Therefore we will merge these two and return [1,4],[6,8], [9,10].

// Input: arr = {{6,8},{1,9},{2,4},{4,7}}
// Output: {{1, 9}} 


class Solution {
    public static List<int[]> mergeIntervals(List<int[]> intervals) {
        if (intervals.size() == 0) {
            return new ArrayList<>();
        }

        // Sort the intervals based on the starting time
        intervals.sort((a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Initialize the first interval as the current interval to merge
        int[] currentInterval = intervals.get(0);
        merged.add(currentInterval); 

        for (int i = 1; i < intervals.size(); i++) {
            int[] nextInterval = intervals.get(i);
            int cur_start = currentInterval[0];
            int cur_end = currentInterval[1];
            int next_start = nextInterval[0];
            int next_end = nextInterval[1];

            // Check for overlap
            if (cur_end >= next_start) {
                // Merge intervals by updating the end time
                currentInterval[1] = Math.max(cur_end, next_end);
            } else {
                // If no overlap, add the next interval to merged list
                currentInterval = nextInterval; 
                merged.add(currentInterval); 
            }
        }
        return merged;
    }
