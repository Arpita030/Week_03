package binary_search.problem_02;

public class PeakElement {
    public static int peakelement(int[] arr){
        int n=arr.length-1;
        int left=0;
        int right=n-1;
        while(left!=right){
                int mid=(left+right)/2;
                if (arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
                  return arr[mid];
                }
                else if(arr[mid] < arr[mid + 1]){
                    left=mid+1;
                }
                else {
                    right=mid-1;
                }
        }
    return -1;
    }
}
