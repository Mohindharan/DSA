public class sort012 {


    public static int[] sort012(int arr[]){
        int[] sortarr = new int[arr.length];
        int i0=0,i1=0,i2=0,n=arr.length;
        for (int i : arr) {
            switch(i){
                case 0:
                i0++;
                break;
                case 1:
                i1++;
                break;
                case 2:
                i2++;
                break;
            }
        }
        
        int i=0;
        while(n!=0){
            if(i0>0){
                arr[i]=0;
                i0-=1;
            }
            else if(i1>0){
                arr[i]=1;
                i1-=1;
            }
            else if(i2>0){
                arr[i]=2;
                i2-=1;
            }

            i++;
            n--;
        }
      
        return arr;
    }
    public static void main(String args[]){
        int[] arr = {0,2,1,2,0};
        int[] sortarr = sort012(arr);
        for (int i : sortarr) {
            System.out.print(i+"\t");
        }

    }
    
}
