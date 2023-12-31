// Given an array (or string), the task is to reverse the array/string.

// **Examples :**
// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

// Input :  arr[] = {4, 5, 1, 2}
// Output : arr[] = {2, 1, 5, 4}


// Iterative java program to reverse an
// array
public class StringReversal {
	
/* Function to reverse */
	static void reversedArray(int arr[])
	{
		int temp;
        int start =0;
		int end= arr.length-1;
        
		while (start < end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}	
	
	/* Utility that prints out an
	array on a line */
	static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}

	// Driver code
	public static void main(String args[]) {
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		printArray(arr);
		reversedArray(arr);
		System.out.print("Reversed array is \n");
		printArray(arr);
		
	}
}

