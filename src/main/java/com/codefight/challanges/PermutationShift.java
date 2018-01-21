package com.codefight.challanges;

public class PermutationShift {

	public static void main(String[] args) {
		int a[] = {5, 4, 3, 2, 1, 0};
		System.out.println(permutationShift(a));

	}
	static int permutationShift(int[] permutation) {
		boolean check = true;
		int count =0;
		int i =0;
		int j =1;
		while(check){
			int[] temp = new int[permutation.length];
			if(permutation[i] > permutation[j]){
				temp[i]=permutation[j];
				temp[j]=permutation[i];
				for(int m=j+1; m < permutation.length;m++){
					temp[m] = permutation[m];
				}

				count++;

				i++;
				j++;
				System.out.println("******"+i);
				permutation = temp;
				for(int k=0;k < temp.length;k++){
					System.out.println(permutation[k]);
				}
				if(j > permutation.length){
					i=0;
					j=1;
				}
			}else{
				check = false;
			}
			
		}
		
		return count;
	}


}
