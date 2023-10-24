class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int k=0;
        for(int num:set)
        {
            nums[k]=num;
            k++;
        }
        return k;
    }
}
