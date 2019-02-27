package com.mhwang;

public class SearchMatrix {

	public static boolean searchMatrix(int[][] matrix, int target){
		if (matrix.length == 0) return false;
		int row = 0;
		int col = matrix[0].length - 1;
		int temp;
		boolean result = false;
		while(row < matrix.length && col >= 0){
			temp = matrix[row][col];
			System.out.println("search temp is "+temp);
			if (temp == target){
				result = true;
				System.out.println("search success index is ("+row+","+col+")");
				break;
			}else{
				if (temp > target){
					col--;
				}else{
					row++;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] test1 = {
			{1,4,7,11,15},
			{2,5,8,12,19},
			{3,6,9,16,22},
			{10,13,14,17,24},
			{18,21,23,26,30},
		};
		int target = 20;
		boolean result = searchMatrix(test1, target);
		System.out.println("search "+target +"result is "+result);

	}

}
