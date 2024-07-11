import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> solMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer sol = solMap.get(diff);
            if (sol == null) {
                solMap.put(nums[i], i);
            } else {
                return new int[] { sol, i };
            }
        }
        return nums;
    }
}