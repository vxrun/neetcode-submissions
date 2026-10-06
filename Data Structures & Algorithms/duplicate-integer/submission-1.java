class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int num: nums){
            map.add(num);
        }
        return map.size() != nums.length;
    }
}