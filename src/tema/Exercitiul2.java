package tema;

public class Exercitiul2 {

	public static int binarySearchI(int[] nums, int target) {
		
		  int left = 0;
		  int right = nums.length - 1;
		  int position = 0;
		  
		  while (left <= right) {
			  
		       int middle = (left + right) / 2;
		 
		       if (target == nums[middle]) {
		         return middle;
		       } else if (target < nums[middle]) {
		         right = middle - 1;
		       } else if (target > nums[middle]) {
		         left  = middle + 1;
		       }
		       
		       position = target < middle ? middle : right + 1;
		       
		       
		   }
		 
		   return position;
	}

	public static void main(String[] args) {
		
		int[] array = new int[]{2, 3, 5, 6, 8, 12};
		
		System.out.println(binarySearchI(array, 9)); // pos 5
		System.out.println(binarySearchI(array, 4)); // pos 2
		System.out.println(binarySearchI(array, 0)); // pos 0
		System.out.println(binarySearchI(array, 1)); // pos 0
		System.out.println(binarySearchI(array, 7)); // pos 4
		System.out.println(binarySearchI(array, 11)); // pos 5
		System.out.println(binarySearchI(array, 13)); // pos 6

	}
}
