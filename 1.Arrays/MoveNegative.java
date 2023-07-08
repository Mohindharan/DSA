// An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

// Examples : 

// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5

public class MoveNegative {
    

    public static void main(String[] args)
    {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };
                        
        int arr_size = arr.length;
     
        // Function Call
        shiftall(arr, 0, arr_size - 1);
        display(arr);
    }

    private static void shiftall(int[] arr, int i, int j) {
        
        while(i<=j){
            if(arr[i]>0 && arr[j]<0){
                int temp =arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
                j--;
            }
            else if(arr[i]<0 && arr[j]>0){
                i++;
                j--;
                
            }
            else if (i==j&& arr[i-1]>0){
                int temp =arr[i];
                arr[i]= arr[i-1];
                arr[i-1]= temp;
                i++;
                j--; 

            }
            else if (i==j&& arr[i+1]<0){
                int temp =arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
                i++;
                j--; 

            }
            else{
                i++;
                j--; 
            }
            System.out.println(i+" "+j);
            display(arr);
        }
        // return arr;
    }

    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        System.out.println(" ");
        
    }
}
