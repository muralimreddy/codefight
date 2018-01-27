package com.codefight.challanges;

public class InvertPictureFrame {

	public static void main(String[] args) {
		int[][] printArr = invertPictureFrame(4);
		for (int[] is : printArr) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	static int[][] invertPictureFrame(int x) {
		   int array[][] = new int[x][x];
		   int f = 1;
		   for(int i=0; i <x; i++){ 
			   for(int j=0; j < x; j++){
				   if(j==0) array[i][j]=f++; //first column
				   if(i>0 && j==0) array[j][i]=array[j][i-1]+x; //first row
				   if(i==(x-1) && j > 0) array[x-1][j] = array[x-1][j-1]+x; //last row
			   }
		   }

		   for(int i=0;i <x;i++){
			   for(int j=0; j<x; j++){
				   if(i>0 && j== (x-1) ) array[i][x-1] = array[i-1][x-1]+1;//last column
				   if(i>0 && i < (x-1) && j>0 && j < (x-1)) array[i][j]=++f;
			   }
			   if(i>0 && i < (x-1) ) {
				   f = f + 2 + (x%2) - (x%2);
			   }
			   
		   }
		   return array;
		}


}
