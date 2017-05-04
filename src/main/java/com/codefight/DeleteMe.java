package com.codefight;

import java.util.Arrays;

public class DeleteMe {
	public static void main(String[] args){
		int[] statues = {6, 2, 3, 8};
	    int result = 0;
	    Arrays.sort(statues);
	    
	    for(int i=0; i < statues.length; i++){
	        result += (statues[i+1] - statues[i])-1;
	    }
	    System.out.println( result);

	}
	
	static int counts(int[] statues){
		 int min=statues[0];
		    int max=statues[0];
		    for(int i=0;i<statues.length;i++){
		        if(statues[i]>max){
		            max=statues[i];
		        }
		        if(statues[i]<min){
		            min=statues[i];
		        }
		    }
		    return max-min-statues.length+1;
	}
}
