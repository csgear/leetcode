package com.vkeonline.lintcode;

import java.util.Arrays;

public class _0533 {
    public class Solution {
        /**
         * @param nums: an integer array
         * @param target: An integer
         * @return: the difference between the sum and the target
         */
        public int twoSumClosest(int[] nums, int target) {
            // write your code here

            if(nums == null || nums.length < 2)  return -1 ;

            Arrays.sort(nums) ;

            int left = 0, right = nums.length - 1 ;
            int diff = Integer.MAX_VALUE ;

            while(left < right) {
                diff = Math.min(diff, Math.abs(nums[left] + nums[right] - target)) ;
                if(nums[left] + nums[right] > target) {
                    right-- ;
                }
                else {
                    left++ ;
                }
            }

            return diff ;
        }
    }
}
