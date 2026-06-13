package q5;

public class BinarySearchCode {

	public static void main(String[] args) {
		int array[] = {9, 21, 34, 48, 57, 66, 83} ;
		int target = 66;
		int left = 0;
		int right = array.length - 1;
		int mid = (left+right)/2;
		boolean found = false;
		int count = 0;
		while (left<=right) {
			count++;
			System.out.print("Left="+left+" ");
			System.out.print("Right="+right+" ");
			System.out.print("Mid="+mid+" ");
			System.out.println("Value="+array[mid]);
			if (target==array[mid]) {
				found = true;
				System.out.println("Found at index "+mid);
				break;
			}
			else if (target>array[mid]) {
				left = mid+1;
				mid = (left+right)/2;
			}
			else {
				right = mid-1;
				mid = (left+right)/2;
			}
		}
		if (!found) {
			System.out.println(target+" was not found in the array in "+count+" step/s");
		}
		System.out.println("Total Steps = "+count);
	}

}
