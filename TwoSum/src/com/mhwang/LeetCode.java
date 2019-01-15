package com.mhwang;

import java.util.HashMap;

public class LeetCode {
	
	public static int[] twoSum(int[] nums, int target){
		if (nums.length < 2){
			return null;
		}
		
		int[] result = null;
		for (int i = 0; i < nums.length; i++){
			for (int j = i + 1; j < nums.length; j++){
				if (nums[i] + nums[j] == target){
					result = new int[2];
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}
	
	public static int[] twoSumImprove(int[] nums, int target){
		if (nums.length < 2){
			return null;
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = null;
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
            	result = new int[2];
            	result[0] = map.get(target - nums[i]);
            	result[1] = i;
                break;
            }
            // 将比较过的数加入map
            map.put(nums[i], i);
        }
        return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,2,3};
		int target = 6;
		int[] result = twoSumImprove(nums, target);
		if (result == null){
			System.out.println("result is null");
		}else{
			System.out.println(result[0]+","+result[1]);
		}
	}

}
