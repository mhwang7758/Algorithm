package com.mhwang;

public class SingleNum {

	public static int singleNum(int[] nums){
		int result = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++){
			result = result ^ nums[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] test1 = {2,2,1};
		int singleNum = singleNum(test1);
		System.out.println("test1 singleNum is "+singleNum);
		int[] test2 = {4,1,2,1,2};
		singleNum = singleNum(test2);
		System.out.println("test2 singleNum is "+singleNum);
	}

}
