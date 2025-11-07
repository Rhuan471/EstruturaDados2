public class InsertionSort {

	    public static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
	    }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3, 4, 8, 7};
        int[] sortedArr = insertionSort(arr);
        for(int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
