public class RotateArray1 {

    
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5};
        rotate(arr,arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void rotate(int arr[], int n)
    {
        int last = arr[n-1];
        
        for(int i=n-1;i>0;i--){
            
            arr[i]=arr[i-1];
            

        }
        arr[0]=last;
    }

}
