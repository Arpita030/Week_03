package problem_03;

public class DemoStringBuffer {
    public static void checkPerformance(int size){
        StringBuffer sbf=new StringBuffer();
        long startTime,endTime;
        startTime=System.nanoTime();
        for(int i=1;i<=size;i++){
            sbf.append(i);
        }
        endTime=System.nanoTime();

        System.out.println("Time taken by String buffer to perform concatenate operation "+size+" times :"+(endTime-startTime)/1000+" microsecond");
    }
}
