
public class SelectionSortProgram {
	public static void main(String[] args) {
		int [] array = {126,43,26,1,113};
		
		selectionSort(array);

	}
	
	public static void selectionSort(int [] array) {
		for(int index = 0; index < array.length; index++) {
			int minimumIndex = findMinIndex(array,index,array.length-1);
			swap(array,index,minimumIndex);
		}
	}
	
	public static int findMinIndex(int [] array, int startIndex, int endIndex) {
		int indexOfMin = startIndex;
		for(int index = startIndex + 1; index <= endIndex; index++) {
			if(array[index] < array[indexOfMin]) {
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}
	
	public static void swap(int [] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
