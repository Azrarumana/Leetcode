class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max_freq=0;
        int maxLength=0;
        int[] count= new int[26];

        for(int right=0;right<s.length();right++)
        {
            count[s.charAt(right)-'A']++;
           
            max_freq=Math.max(max_freq, count[s.charAt(right)-'A']);

            while(right-left+1  - max_freq > k)  // shrinking the size 
            {
                count[s.charAt(left)-'A']--; // re,ove element from left
                left++;
            }
            maxLength=Math.max(maxLength, right-left+1);  //right-left+1 is the size of the current window

        }
        return maxLength;
    }
}
