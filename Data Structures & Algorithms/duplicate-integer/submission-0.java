class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dupli = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!dupli.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}