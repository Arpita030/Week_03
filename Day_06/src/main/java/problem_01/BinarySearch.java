package problem_01;

public class BinarySearch {
    public static void checkPerformance(int size,int target){
        int [] arr=new int[size];
        int left=0,right=size-1;
        int mid;
        double startTime,endTime;

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        startTime=System.nanoTime();
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==target){
                break;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        endTime=System.nanoTime();
        System.out.println("Time taken for binary search in an array of size "+size+": "+((endTime-startTime)/1000)+" microseconds");
    }
}
