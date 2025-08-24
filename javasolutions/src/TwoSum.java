import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

        Constraints:
        2 <= nums.length <= 104
       -109 <= nums[i] <= 109
       -109 <= target <= 109
        Only one valid answer exists.

        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
    */
    public int[] twoSum(int[] nums, int target) {
        /*
        Consider example 2 from above.
        Create a map to store the number from the array and its index.
        */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { // iterate through the  array, using this type of array over for each since we will need to have the index as well as it needs to be returned.
            int remainder = target - nums[i]; // calculate the difference between the target and the current number. Here as per example 2 it will be first 6-3 and then 6-2 and then 6-4.
            if (map.containsKey(remainder)) {
                // if the map contains the remainder then just return the indices of both the remainder and the number.
                return new int[]{map.get(remainder), i};
            } else {
                map.put(nums[i], i); // if the key does not already exist, then put the key in the map along with its index i. So it will look like {3,0} and then {2,1} and then {4,2}
            }
        }
        /*
         when the condition reaches the number 4. It will calculate 6-4 which is 2 and see that 2 is already in the map. So it returns following
         map.get(remainder) will return 1 which is the index of 2. map.get(2)
         and i is the current index which is for the number 4 and its index is 2.
         so the final output will be [1,2]
        */
        return new int[]{};
    }
}
