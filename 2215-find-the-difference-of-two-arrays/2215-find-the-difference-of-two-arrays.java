class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }

        for(int i:nums2){
            set2.add(i);
        }

        List<List<Integer>> res= new ArrayList<>();
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        for(int num: set1){
            if(!set2.contains(num))
            {
                list1.add(num);
            }
        }

        for(int num: set2){
            if(!set1.contains(num))
            {
                list2.add(num);
            }
        }
        res.add(list1);
        res.add(list2);
        
        return res;
    }
}