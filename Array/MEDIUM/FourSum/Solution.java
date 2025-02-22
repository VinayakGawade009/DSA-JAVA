import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0; i<n; i++) {
            if(i > 0 &&  nums[i] == nums[i-1]) continue; // Avoid repitition of elements
            for(int j=i+1; j<n; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;// Avoid repitition of elements

                int k = j+1;
                int l = n -1;
                while(k<l) {
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    // int sum = nums[i] + nums[j];
                    // sum += nums[k];
                    // sum += nums[l];
                    // if(sum == target) {
                    //     List<Integer> list = new ArrayList<>();
                    //     list.add(nums[i]);
                    //     list.add(nums[j]);
                    //     list.add(nums[k]);
                    //     list.add(nums[l]);
                    //     ans.add(list);
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++; // Avoid repitition of elements
                        while(k < l && nums[l] == nums[l+1]) l--; // Avoid repitition of elements
                    } else if(sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        } 
        return ans;
    }
}