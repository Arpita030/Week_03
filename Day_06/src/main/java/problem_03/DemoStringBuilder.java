package problem_03;

public class DemoStringBuilder {
    public static void checkPerformance(int size){
        StringBuilder sbl=new StringBuilder();
        long startTime,endTime;
        startTime=System.nanoTime();
        for(int i=1;i<=size;i++){
            sbl.append(i);
        }
        endTime=System.nanoTime();

        System.out.println("Time taken by String builder to perform concatenate operation "+size+" times :"+(endTime-startTime)/1000+" microsecond");
    }
}
