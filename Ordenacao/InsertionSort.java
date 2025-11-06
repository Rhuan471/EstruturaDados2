public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = {5,3,8,2,9,1,11,0,4};

			for(int j = 1; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					j = arr.length;
						System.out.println("Troca: " + arr[j] + " com " + arr[j-1]);
				}
			}
	}
}
