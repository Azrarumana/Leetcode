class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        
        if(n1>n2) return false;

        int arr1[]=new int[26];
        int arr2[]=new int[26];
        
        for(int i=0;i<n1;i++)
        {
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<n2-n1;i++)
        {
            if(isAnagram(arr1, arr2))
            return true;
            else{
                arr2[s2.charAt(i)-'a']--;
                arr2[s2.charAt(i+n1)-'a']++;
            }
        }
        return isAnagram(arr1, arr2);

    }

    private boolean isAnagram(int[] arr1, int[] arr2)
    {
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
            return false;
        }
        
        }
        return true;
        
    }
}