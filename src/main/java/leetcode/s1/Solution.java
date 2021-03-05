package leetcode.s1;

import java.util.Map;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int firstIndex = -1;
        int secondIndex = -1;
        for (int i = 0; i < nums.length ; i++) {
            int leftValue = target - nums[i];
            if (map.containsKey(leftValue)) {
                int index = map.get(leftValue);
                if (index != i) {
                    firstIndex = i;
                    secondIndex = index;
                    break;
                }
            }
        }
        return new int[]{firstIndex, secondIndex};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] inputArray = new int[] {2, 5, 7, 11, 15};
        int target = 10;
        int[] result = solution.twoSum(inputArray, target);
        for (int index: result) {
            System.out.print(index);
        }
    }
}