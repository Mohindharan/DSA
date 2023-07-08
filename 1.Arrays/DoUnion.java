// Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

// Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

// Note : Elements are not necessarily distinct.

// Example 1:

// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.
// import java.util.List;
// import java.util.Arrays;

import java.util.ArrayList;

import java.util.List;

public class DoUnion {
    public static int doUnion(int a[], int b[]) 
    {
        int x = a.length;
        int y = b.length;
        int sum = x;


        List<Integer> alist =  new  ArrayList<Integer>();
        for (Integer i : a) {
            alist.add(i);
        }
        


        for (int i=0;i<y;i++){
            if(!alist.contains(b[i])){
                alist.add(x,b[i]);
                x++;
                sum++;
            }
        }
        return sum;
        
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        
        int b[] = {1,2,3,6};
        int number = doUnion(a,b);
        System.out.println(number);
        
        
    }
}
