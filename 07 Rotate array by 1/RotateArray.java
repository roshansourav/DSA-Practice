// Given an array, rotate the array by one position in clock-wise direction.;


public class RotateArray {

    public void rotateA(int[] arr, int n){
        int temp1 = arr[n-1];
        int temp2 = 0;
        for(int i=0; i<n; i++){
            temp2 = arr[i];
            arr[i] = temp1;
            temp1 = temp2;
            System.out.print("\t"+arr[i]);
        }

    }

    public static void main(String[] ar){

        int[] a = {1, 2, 3, 4, 5} ;
        RotateArray obj = new RotateArray();
        obj.rotateA(a, a.length);
    }
    
}
