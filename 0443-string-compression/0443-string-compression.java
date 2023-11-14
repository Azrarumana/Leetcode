class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count=1;    // appending the first ele of array in sb and keeping count as 1
        sb.append(chars[0]);

        for(int i=1;i<chars.length;i++)
        {
            char prev=chars[i-1];
            char cur=chars[i];
            if(prev==cur)
            {
                count++;
            }
            if(prev!=cur)
            {
                if(count>1)
                    sb.append(count);
                    sb.append(cur);
                    count=1;                
            }
        }
        if(count>1)
        {
            sb.append(count);
        }

        for(int i=0;i<sb.length();i++)
        {
            chars[i]=sb.charAt(i);
        }

        return sb.length();
    }
}