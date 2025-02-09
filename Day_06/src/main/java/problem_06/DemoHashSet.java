package problem_06;

import java.util.HashSet;

public class DemoHashSet {
    public static void checkPerformance(int size){
        HashSet<Integer>hashSet=new HashSet<>();
        double startTime,endTime;
        for(int i=0;i<size;i++){
            hashSet.add(i);
        }

        startTime=System.nanoTime();
        boolean result=hashSet.contains(size-1);
        endTime=System.nanoTime();

        System.out.println("Time taken to search an element in HashSet of size "+size+" is "+(endTime-startTime)/1000000+" ms");

    }
}
