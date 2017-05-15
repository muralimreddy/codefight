package com.codefight;

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		int[] seq = {1, 2, 3, 4, 99, 5, 6};
		System.out.println(almostIncreasingSequence(seq));
	}

	static boolean almostIncreasingSequence(int[] sequence) {
		int length = sequence.length;
		int count = 0;
		for(int index=0; index < length-1; index++){
			if(sequence[index+1] <= sequence[index]){
				count++;
				if(index-1 >= 0 
						&& index+2 <= length-1 
						 && sequence[index] - sequence[index+2] >= 0
			               && sequence[index-1] - sequence[index+1] >= 0) {			                
							return false;
				}
			}
		}
		return count <=1;
	}

	static boolean almostIncreasingSequence1(int[] sequence) {
		int length = sequence.length;
		if(length ==1) return true;
		if(length ==2 && sequence[1] > sequence[0]) return true;
		int count = 0;
		int index = 0;
		boolean iter = true;
		
		while(iter){
			index = checkSequence(sequence,index);
			if(index != -1){
				count++;
				index++;
				if(index >= length-1){
					iter=false;
				}else if(index-1 !=0){
					if(sequence[index-1] <= sequence[index]){
						iter=false;
						count++;
					}else if(((sequence[index] <= sequence[index-2])) && ((sequence[index+1] <= sequence[index-1]))){
						iter=false;
						count++;					
					}
				}
			}else{
				iter = false;
			}
		}
		if(count > 1) return false;
		return true;
	}

	static int checkSequence(int[] sequence, int index){
		for(; index < sequence.length-1; index++){
			if(sequence[index+1] <= sequence[index]){
				return index; 
			}
		}
		return -1;
	}
	
}
