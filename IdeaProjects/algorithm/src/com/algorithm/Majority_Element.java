package com.algorithm;

import java.util.HashMap;

/**
 * Created by JinRuoyu on 01/09/2017.
 */
public class Majority_Element {
    public static void main(String[] main) {
        int nums[] = {2,1,3,3,3};
        System.out.println(majorityElement(nums));
    }

    public static  int majorityElement(int[] nums) {
        int num = nums[0];
        HashMap<Integer, Integer> num_map = new HashMap<Integer, Integer>();
        if(nums.length == 1) return nums[0];
        for (int n : nums
                ) {
            if (num_map.containsKey(n)) {
                int count = num_map.get(n)+1;
                num_map.put(n, count);
                if(count > nums.length/2) {
                    return n;
                }
            }
            else num_map.put(n, 1);
        }
        return num;

    }
}
