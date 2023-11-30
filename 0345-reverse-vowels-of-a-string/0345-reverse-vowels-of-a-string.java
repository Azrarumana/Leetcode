class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        HashSet<Character> set = new HashSet<>();
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        set.add('A'); set.add('I'); set.add('O'); set.add('E'); set.add('U');

        char[] a=s.toCharArray();

        while(i<j)
        {
            if(!set.contains(a[i])){
                i++;
            }
            else if (!set.contains(a[j])){
                j--;
            }
            else{
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;

                i++;
                j--;
            }

        }
        return new String(a);
    }
}