package first;

public class zad {

	
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 5, 8, 10, 13};
		
		int result = binarySearch(arr, 13);
		
		System.out.println(result);

	}
	
	public static void printNum(int num) {
		if (num > 0) {
			printNum(num - 1);
			System.out.println(num);
			
		}
	}
	
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int result = -1;
		
		while (high >= low) {
			int middle = low + ((high - low) / 2);
			
			if (arr[middle] == target) {
				result = middle;
				break;
				
			} else if (target > arr[middle]) {
				low = middle + 1;
				
			} else if (target < arr[middle]) {
				high = middle - 1;
			}
		}
		
		return result;
	}

}
