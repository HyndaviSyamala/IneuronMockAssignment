import java.util.Scanner;

public class MoveZeroes {
	public static int[] moveZeroes(int[] nums) {
	    int left = 0; // Left pointer to track non-zero elements
	    
	    // Iterate through the array
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != 0) {
	            // If the current element is non-zero, move it to the left pointer position
	            nums[left] = nums[i];
	            left++;
	        }
	    }
	    
	    // Filling the remaining elements with zeros
	    while (left < nums.length) {
	        nums[left] = 0;
	        left++;
	    }
	    return nums;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		int[] arr= {0,1,0,3,12};
		
		int[] resarr=moveZeroes(arr);
		
		System.out.println("Result array is: ");
		for(int i=0;i<resarr.length;i++) {
			System.out.print(resarr[i]+" ");
		}
		
		
		

	}

}
