package tema;

public class Exercitiul1 {
	
	public static int binarySearchI(int[] sortedList, int key) {
		  int left = 0;
		  int right = sortedList.length - 1;
		 
		  while (left <= right) {
		       int middle = (left + right) / 2;
		 
		       if (key == sortedList[middle]) {
		         return middle;
		       } else if (key < sortedList[middle]) {
		         right = middle - 1;
		       } else if (key > sortedList[middle]) {
		         left  = middle + 1;
		       }
		   }
		 
		   return -1;
		}

	public static void main(String[] args) {
		
		int[] array = new int[]{1, 2, 3, 4, 5, 6};
		
		System.out.println(binarySearchI(array, 5));

	}

}
