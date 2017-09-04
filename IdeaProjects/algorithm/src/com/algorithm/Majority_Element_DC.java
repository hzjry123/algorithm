package com.algorithm;

/**
 * Created by JinRuoyu on 04/09/2017.
 */
public class Majority_Element_DC {
    public static void main(String[] main){
        int flag = 0;
        int count = 0;
        int nums[] = {47,47,72,47,72,47,79,47,12,92,13,47,47,83,33,15,18,47,47,47,47,64,47,65,47,47,47,47,70,47,47,55,47,15,60,47,47,47,47,47,46,30,58,59,47,47,47,47,47,90,64,37,20,47,100,84,47,47,47,47,47,89,47,36,47,60,47,18,47,34,47,47,47,47,47,22,47,54,30,11,47,47,86,47,55,40,49,34,19,67,16,47,36,47,41,19,80,47,47,27};
        System.out.println(majorityElement(nums));
        System.out.println(nums.length);
        for (int num:nums
             ) {
            if(num == 47) flag++;
        }
        System.out.println(count);

    }
    public static int majorityElement(int[] nums){

        return majorityElement_DC(nums,0,nums.length-1);
    }
    public static int majorityElement_DC(int[] nums,int begin,int end){
        if(begin == end){
            return nums[begin];
        }
        int mid = (begin + end)/2;
        int flag = 0;

        int mE_left = majorityElement_DC(nums, begin, mid);
        int mE_right = majorityElement_DC(nums, mid + 1, end);

        if(mE_right == mE_left) return mE_left;
        else {
            for(int i = begin; i <= end; i++){
                if(mE_left == nums[i]) flag++;
            }
            if(flag > (end - begin)/2){
                return mE_left;
            }
            return mE_right;
        }//end else
    }//end DC
}
