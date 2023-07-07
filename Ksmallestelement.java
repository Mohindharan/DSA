import java.util.Arrays;
import java.util.PriorityQueue;




public class Ksmallestelement {

    public static int kthSmallest(int[] arr, int k) 
    { 
        //solution 1
        
        // Arrays.sort(arr);
        // return arr[k-1];
        
        // solution 2
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            
        }
        while(k!=1){
                pq.remove();
                k-=1;
        }
        return pq.peek();
    } 
    public static void main(String[] args)
    {
        int[] arr = { 12, 3, 5, 7, 19 };
        // int N = arr.length;
        int K = 4;
 
        // since counting starts from 0 so to find kth
        // element we need to reduce K by 1

        System.out.println(kthSmallest(arr,K));
    }
    
}
