class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[][] result = new int[intervals.length][2];
        int resIndex = 0;
        result[0] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] last = result[resIndex];
            int[] current = intervals[i];

            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            } else {
                resIndex++;
                result[resIndex] = current;
            }
        }

        return Arrays.copyOf(result, resIndex + 1);
    }
}
