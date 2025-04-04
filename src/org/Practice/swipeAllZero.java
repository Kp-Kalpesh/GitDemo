package org.Practice;

import java.lang.reflect.Array;

public class swipeAllZero {
		public static void main(String[] args) {
	
			int[] arr = {0,7,8,7,0,5,0,6,5,0};
			pushZerosToEnd(arr);
			
			// Print the modified array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
		}
		
		
		// function to move all zeros to the end
	    static void pushZerosToEnd(int[] arr) {
	        int n = arr.length;
	        int[] temp = new int[n];
	
	        // to keep track of the index in temp[]
	        int j = 0;
	
	        // Copy non-zero elements to temp[]
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0)
	                temp[j++] = arr[i];
	        }
	
	        // Fill remaining positions in temp[] with zeros
	        while (j < n)
	            temp[j++] = 0;
	
	        // Copy all the elements from temp[] to arr[]
	        for (int i = 0; i < n; i++)
	            arr[i] = temp[i];
	    }
}


//	public static void main(String[] args)
//	{
//
//		for(int n=50; n>10; n--)
//		{
//			System.out.println(n);
//		}
//
//	}
//}





/*

//input = [0787050650];
	//output = [7875650000]

	       ar[] i = {0,7,8,7,0,5,0,6,5,0};
	       int j = rearrangeDigits(i);
	       System.out.println("output" + j);
	       }

	    public int rearrangeDigits(int num){
	        String numstr = String.valueOf(num);
	        char[] digits = numstr.toCharArray();
	        Array.sort(digits);

	        StringBuilder reversed = new StringBuilder(new String(digits)).reverse();

	        return Integer.parseInt(reversed.toString());
	    }


 */