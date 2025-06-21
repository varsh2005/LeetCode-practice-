class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.addLast(i);
            if(i>=k-1){
                result[i-k+1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
