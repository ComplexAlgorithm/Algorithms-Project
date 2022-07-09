import java.util.Scanner;

public class BinarySearchProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int [] array = {2,17,32,57,89};
		
		System.out.println("Enter the number you are looking for?");
		int searchingFor = keyboard.nextInt();
		
		boolean found = binarySearch(array,searchingFor,0,array.length-1);
		System.out.println(found);
	}
	
	//determine the middle of the array and then check to make sure first is not greater than last
	//if first is greater than last then just return false
	//otherwise check to see if the item that you are searchingFor is equal to the item in the middle
	//if it is return true, otherwise if the item you are searchingFor is less than the middle
	//then call binarySearch recursively, but only search the left of the middle 
	//otherwise if the item you are are searchingFor is greater than the middle
	//then call binarySearch recursively, but only search the right of the middle
	//at the end the method should return true if the item is in the array, otherwise return false
	//do not use a loop, but instead use recursion to repeat the process
	public static boolean binarySearch(int [] array, int searchingFor, int first, int last) {
		int midPoint = ((first + last) / 2); //integer division, 4 / 2 = 2 (index 2)
		if(first > last) { //first should be less than last
			return false;
		}
		else {
			if(searchingFor == array[midPoint]) { //if the item I'm searchingFor is the midPoint then return true
				return true;
			}
			else if(searchingFor < array[midPoint]) { //if the item I'm searchingFor is less than the midPoint then search the left or first half
				return binarySearch(array,searchingFor,first,midPoint-1); 
			}
			else { //the item I'm searchingFor is greater than the midPoint then search right or second half
				return binarySearch(array,searchingFor,midPoint+1,last);
			}
		}
	}

}