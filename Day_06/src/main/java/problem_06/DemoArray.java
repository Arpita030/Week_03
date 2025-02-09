package problem_06;

public class DemoArray {
    public static void checkPerformance(int size){
        int [] arr=new int[size];
        long startTime,endTime;
        for(int i=0;i<size;i++){
            arr[i]=i;
        }

        startTime=System.nanoTime();
        for(int num :arr){
            if(num==size-1){
                break;
            }
        }
        endTime=System.nanoTime();

        System.out.println("Time taken to search element in an Array of size "+size+" is :"+(endTime-startTime)/1000000+" ms");

    }
}
