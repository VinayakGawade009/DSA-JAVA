public class Solution {
    public static int majorityElement(int[] nums) {
        // // Approach 1: Sorting
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        // Approach 2: Moore Voting Algorithm
        // idea: maority element always counts greater than n/2 
        int count = 0;
        int candidate = 0;
        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                count++;
                candidate = nums[i];
            } else if(candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 3, 3, 1, 3};
        System.out.println("Majority Element is " + majorityElement(nums));
    }
}

