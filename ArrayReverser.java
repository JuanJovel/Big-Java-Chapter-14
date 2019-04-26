import java.util.Scanner;

public class ArrayReverser {

	public static void main(String[] args) {

		int[] theArray = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a lenght for the array:");
		final int LENGTH = s.nextInt();
		System.out.println("Enter " + LENGTH + " elements to fill your array");
		theArray = new int[LENGTH];
		for (int r = 0; r < LENGTH; r++) {
			theArray[r] = s.nextInt();
		}

		theArray = reverseMe(theArray);
		System.out.println("Your array reversed:");

		boolean last = false;

		for (int b = 0; b < LENGTH; b++) {
			if (b == LENGTH - 1) {
				last = true;
			}
			if (!last) {
				System.out.print(theArray[b] + ", ");
			}

			else {
				System.out.print(theArray[b]);
			}
		}
		
		s.close();

	}

	public static int[] reverseMe(int[] myArray) {
		for (int x = 0; x < myArray.length / 2; x++) {
			final int INDEXHANDLER = myArray.length - 1;
			int temp = myArray[x];
			int temp2 = myArray[INDEXHANDLER - x];
			myArray[x] = temp2;
			myArray[INDEXHANDLER - x] = temp;
		}

		return myArray;
	}

}
