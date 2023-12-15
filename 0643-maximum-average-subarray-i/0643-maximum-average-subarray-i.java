class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double maxSum=0;

        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxSum=sum/k; // first k elements average

        for(int right=k; right< nums.length; right++) // remaining elements
        {
            sum+= nums[right]-nums[right-k];
            maxSum=Math.max(maxSum, sum/k);
        }
        return maxSum;
    }
}