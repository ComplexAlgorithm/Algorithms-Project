import java.util.Scanner;

public class LinearSearchProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int [] array = {2,17,89,32,57}; //creates an array of as many elements as there items between the curly braces
		
		System.out.println("Enter the number you are looking for?");
		int searchingFor = keyboard.nextInt();
		
		boolean found = linearSearch(array,searchingFor);
		System.out.println(found);
	}

	//start at the beginning of the array and check each item in the array to see if it is equal to
	//the item that the user is searching for and if it is equal, stop searching and return true
	//otherwise keep searching the remainder of the array and if the item is not found by the time
	//the method gets to the end of the array then just return false to represent the item 
	//is not in the array
	//try to analyze the run time of this method to determine what is 
	//its Big O Notation to represent how long it will take to run this method
	//in the worst case scenario
	public static boolean linearSearch(int [] array, int searchingFor) {
		boolean found = false;
		int index = 0;
		
		while(!found && index < array.length) {
			if(array[index] == searchingFor) {
				found = true;
			}
			else {
				index++;
			}
		}
		
		return found;
		
		//for(int index = 0; index < array.length && found == false; index++) {
		//	if(array[index] == searchingFor) {
		//		found = true;
		//	}
		//}
	}
}
