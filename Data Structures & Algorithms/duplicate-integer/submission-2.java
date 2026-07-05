class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> dupMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (dupMap.containsKey(nums[i])) {
                return true;
            } else {
                dupMap.put(nums[i], 1);
            }
        }
        return false;
    }
}