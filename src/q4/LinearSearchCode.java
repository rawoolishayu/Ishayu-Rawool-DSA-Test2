package q4;

public class LinearSearchCode {

	public static void main(String[] args) {
		int arr[] = {33, 8, 71, 19, 56, 44, 27};
		int target = 56;
		boolean found = false;
		int count = 0;
		for (int i = 0;i<arr.length;i++) {
			count++;
			System.out.println("Checking index "+i+" value "+arr[i]);
			if (arr[i]==target) {
				found = true;
				System.out.println("Found at index "+i);
				break;
			}
		}
		if (!found) {
			System.out.println("Number "+target+" not found in array");
		}
		System.out.println("Total Steps = "+count);
	}

}
