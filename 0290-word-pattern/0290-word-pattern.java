class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(pattern.length()!=words.length)
        {
            return false;
        }
       
        HashMap<Character, String> map= new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            char p = pattern.charAt(i);
            if(map.containsKey(p))
            {
                if(!words[i].equals(map.get(p)))
                {
                    return false;
                }
                
            }
            else
            {
                if(map.containsValue(words[i]))
                {
                    return false;
                }
                map.put(p,words[i]);
            }
            
        }
         return true;
    }
}