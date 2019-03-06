package com.mhwang;

public class MaximunProductSubarray {

	public static int maxProduct(int[] nums){
		int length = nums.length;
		if (length == 1) return nums[0];
		
		int lastMax = nums[0];
		int lastMin = nums[0];
		int curMax;
		int curMin;
		int result = lastMax;
		for (int i = 1; i < length; i++){
			curMax = Math.max(lastMax * nums[i], lastMin * nums[i]);
			curMin = Math.min(lastMax * nums[i], lastMin * nums[i]);
			lastMax = Math.max(nums[i], curMax);
			lastMin = Math.min(nums[i], curMin);
			result = Math.max(result, lastMax);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] test1 = {2,3,-2,4};
		int result = maxProduct(test1);
		System.out.println("test1 max product is "+result);
		int[] test2 = {0,2};
		result = maxProduct(test2);
		System.out.println("test2 max product is "+result);
	}

}
