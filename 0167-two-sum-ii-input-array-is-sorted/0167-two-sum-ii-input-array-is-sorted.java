class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int res[]=new int[2];
        int start=0, end=n-1, sum=0;
        while(start<end)
        {
            sum=numbers[start]+numbers[end];
            if(sum==target){
                res[0]=start+1;
                res[1]=end+1;
                start++;
                end--;
            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }
        }
        return res;
    }
}