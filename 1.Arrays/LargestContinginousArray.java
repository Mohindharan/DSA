public class LargestContinginousArray {

private static int largestContinginousArray (int[] arr){
    int max = Integer.MIN_VALUE;
    int runningMax =0;

    //kadane algo

    for (int i= 0 ;i<arr.length;i++){
        runningMax+=arr[i];
        max = runningMax>max?runningMax:max;
        if (runningMax<0)runningMax=0;
    }

    return max;
}

public static void main(String args[]){
    
    int arr[] = {1,2,3,-2,5};
    System.out.println("largest sum of contingious array "+largestContinginousArray((arr)));
    int arr1[] = {-4,-5,1,2,3};
    System.out.println("largest sum of contingious array "+largestContinginousArray((arr1)));

    }


}










