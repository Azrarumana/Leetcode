class Solution {
    int numValue(char ch)
    {
        if(ch=='I')
            return 1;
        if(ch=='V')
            return 5;
        if(ch=='X')
            return 10;
        if(ch=='L')
            return 50;
        if(ch=='C')
            return 100;
        if(ch=='D')
            return 500;
        if(ch=='M')
            return 1000;   
        return -1; 
    }
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int n1=numValue(s.charAt(i));
            if(i+1<s.length())
            {
                int n2=numValue(s.charAt(i+1));
                if(n1>=n2){
                    sum+=n1;
                }
                else{
                    sum-=n1;
                }
            }
            else{
                sum+=n1;
            }
        }
        return sum;
    }
}