// Given an array of size N. The task is to find the maximum and 
// the minimum element of the array using the minimum number of comparisons.

// Examples:

// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1 Maximum element is: 9

// Input: arr[] = {22, 14, 8, 17, 35, 3}
// Output:  Minimum element is: 3 Maximum element is: 35
public class MaxMin {
    
    
    
    
    static class Pair {
		int min;
		int max;
    public  Pair(){
        max=0;
        min=0;
        }
    
	}

    public static void main(String args[]){

        int arr[] = {1000, 11, 445, 1, 330, 3000};
	
		Pair minmax = getMinMax(arr);
		System.out.printf("\nMinimum element is %d", minmax.min);
		System.out.printf("\nMaximum element is %d", minmax.max);
    }

    private static MaxMin.Pair getMinMax(int[] arr ) {
        int arr_size = arr.length;


        Pair mm = new Pair();
        
        if(arr_size==0)
            System.out.println("array size = 0");
        else if (arr_size==1) {
            mm.max=arr[0];
            mm.min=arr[0];
            
        } else {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr_size;i++){
                min = (arr[i]<min)?arr[i]: min;
                max = (arr[i]>max)?arr[i]: max;
            }
            mm.max=max;
            mm.min=min;
        }
        return mm;
    }
}
