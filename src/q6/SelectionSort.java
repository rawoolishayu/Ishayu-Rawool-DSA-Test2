package q6;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {65, 25, 12, 22, 11};
		System.out.print("Before sorting: ");
		printArray(arr);
		int pass = 0;
		int swap = 0;
		for (pass=0;pass<arr.length-1;pass++) {
			System.out.println("--- Pass "+(pass+1)+" ---");
			int minIndex = pass;
			System.out.println("Assumed minimum: "+arr[minIndex]+" at index "+minIndex);
			for (int i = minIndex+1;i<arr.length;i++) {
				if (arr[minIndex]>arr[i]) {
					minIndex = i;
					System.out.println("New minimum found: "+arr[minIndex]+" at index "+minIndex);
				}
			}
			if (minIndex!=pass) {
				swap++;
				System.out.println("Swapped: "+arr[minIndex]+" to index "+pass);
				int temp = arr[minIndex];
				arr[minIndex] = arr[pass];
				arr[pass] = temp;
			}
			System.out.print("Array after Pass "+(pass+1)+": ");
			printArray(arr);
		}
		System.out.println("Total Swaps: "+swap);
		System.out.print("After Sorting: ");
		printArray(arr);
	}
	public static void printArray(int arr[]) {
		for (int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
