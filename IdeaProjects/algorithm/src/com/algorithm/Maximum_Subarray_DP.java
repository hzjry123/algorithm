package com.algorithm;
//Maxium_Subarray
//test:{2-,-1,-3,4,-1,2,1,-5,4},{-1}
//using dynamic programming complexity=
/**
 * Created by JinRuoyu on 29/08/2017.
 */
public class Maximum_Subarray_DP {
    public static void main(String[] args){

        int a[] = {-2};
        System.out.println(Maximum_Subarray_DP(a));
    }
    public static int Maximum_Subarray_DP(int[] nums){
        int Max_Sum = Integer.MIN_VALUE;//min_value also = -1/0.0.
        int this_sum = 0;//every subarray new sum, 1which means start from element>0,
        // 2means it is the active subarray which should be taken into consideration
        // max_sum only renew when this_sum>max_sum
        for (int num : nums) {
            //
            this_sum += num;
            if (this_sum > Max_Sum) Max_Sum = this_sum;
            if (this_sum < 0) this_sum = 0;
        }
        return Max_Sum;
    }
}
