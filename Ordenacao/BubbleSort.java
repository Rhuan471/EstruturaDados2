public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = {7,6,4,3};

		for(int i = 0; i < arr.lrnght-1; i++) {
			for(int j = 0; j < arr.lenght-1; j++) 

				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.lenght; i++) {
			System.out.println(arr[i]);
	}
}
