package com.mhwang;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		int element = 0;
		int count = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++){
			if (count == 0){
				count++;
				element = nums[i];
			}else{
				if (element == nums[i]){
					count++;
				}else{
					count--;
				}
			}
		}
        return element;
    }
	public static void main(String[] args) {
		int test1[] = {2,3,2};
		int result = majorityElement(test1);
		System.out.println("test1 majorityElement is "+result);
		
		int test2[] = {2,2,1,1,1,2,2};
		result = majorityElement(test2);
		System.out.println("test2 majorityElement is "+result);
	}

}
