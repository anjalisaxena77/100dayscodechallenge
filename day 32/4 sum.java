/* Question:  
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109

*/
Solution:
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                long target2 = (long) target - (long) nums[i] - (long) nums[j];
                int lower = j + 1, higher = nums.length - 1;

                while (lower < higher) {
                    int twoSum = nums[lower] + nums[higher];

                    if (twoSum < target2) lower++;
                    else if (twoSum > target2) higher--;
                    else {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[lower], nums[higher]);
                        ans.add(quad);

                        while (lower < higher && nums[lower] == quad.get(2)) lower++;
                        while (lower < higher && nums[higher] == quad.get(3)) higher--;
                    }
                }

                while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
            }

            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        }

        return ans;
    }
}
        
    
