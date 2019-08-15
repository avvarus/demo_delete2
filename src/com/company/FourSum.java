package com.company;


public class FourSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        FourSum solution = new FourSum();
        solution.twoSum(nums, 9);
        System.out.println(solution.twoSum(nums, 9).length);

    }


    public int[] twoSum(int[] nums, int target) {

        int[] retur = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    retur[0] = i;
                    retur[1] = j;
                }
            }
        }
        return retur;
    }

}
