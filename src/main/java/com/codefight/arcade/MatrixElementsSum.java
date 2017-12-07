package com.codefight.arcade;

public class MatrixElementsSum {

	public static void main(String[] args){
		int[][] matrix = {{1, 1, 1, 0}, 
		              	  {0, 5, 0, 1}, 
		              	  {2, 1, 3, 10}};
		//matrixElementsSum(matrix);
		System.out.println(matrixElementsSum1(matrix));
		
	}
	
	static int matrixElementsSum1(int[][] matrix){
		int sum =0;
		
		for(int x=0; x < matrix[0].length; x++){
			for(int y=0; y < matrix.length; y++){
				if(matrix[y][x] ==0) break;
				sum += matrix[y][x];
			}
		}
		return sum;
	}
	
	static int matrixElementsSum(int[][] matrix){
		int sum =0;
		for(int i=0; i < matrix.length;i++){
			for(int k=0; k < matrix[i].length; k++){
				if(i==0) {
					sum += matrix[i][k];
					continue;
				}
				boolean haunted = false;
				for(int j=i-1;j>=0; j--){
					if(matrix[j][k] ==0){
						haunted=true;
						break;
					}
				}
				if(!haunted){
					sum += matrix[i][k];
				}
			}
		}
		return sum;
	}
}
