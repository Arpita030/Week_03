package inputstreamreader.challenge_problem;

public class StringBuilderTime {
    static long startTime,endTime;

    public static long builderTime(){
    StringBuilder sbl=new StringBuilder();
    startTime=System.nanoTime();
        for(int i=0;i<=1000000;i++){
        sbl.append("hello");
    }
    endTime=System.nanoTime();
    long l = endTime - startTime;
        return l;
   }
}
