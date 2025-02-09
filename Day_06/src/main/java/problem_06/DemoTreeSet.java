package problem_06;

import java.util.TreeSet;

public class DemoTreeSet {
     public static void checkPerformance(int size){
         TreeSet<Integer>treeSet=new TreeSet<>();
         double startTime,endTime;
         for(int i=0;i<size;i++){
             treeSet.add(i);
         }

         startTime=System.nanoTime();
         treeSet.contains(size-1);
         endTime=System.nanoTime();

         System.out.println("Time taken to search an element in a TreeSet of size "+size+" is "+(endTime-startTime)/1000000+" ms");
     }
}
