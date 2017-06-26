import java.util.Scanner;
import java.util.Arrays;


public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 8, 9, 11, 18, 20};
		
		int result = binarySearch(5, arr);
		System.out.println(result);
	}
	
	public static int binarySearch(int key, int[] array) {
		int low = 0;
		int high = array.length - 1;
		int result = -1;
		
		while (high >= low) {
			int middle = low + ((high - low) / 2);
			
			if (array[middle] == key) {
				result = middle;
				break;
				
			} else if (array[middle] > key) {
				high = middle - 1;
				
			} else if (array[middle] < key) {
				low = middle + 1;
			}
		}
		
		return result;
	}

}
