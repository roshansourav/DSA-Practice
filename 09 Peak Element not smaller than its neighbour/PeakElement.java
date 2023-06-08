// Find a peak element which is not smaller than its neighbours

// Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 

class PeakElement{

    public void findPeak(int ar[], int n){
        if(n < 1)
        {
            System.out.println("\nPeak = "+ar[0]);
        }
        else{
            for(int i= 1; i<n-1; i++){
                if(ar[i]>ar[i-1] && ar[i]>ar[i+1]){
                    System.out.println("\nPeak = "+ar[i]);
                }
            }
        }
        
    }

    public static void main(String arr[]) {

        int ar[] = {10, 20, 15, 2, 23, 90, 67};
        PeakElement obj = new PeakElement();
        obj.findPeak(ar, ar.length);
    }
}