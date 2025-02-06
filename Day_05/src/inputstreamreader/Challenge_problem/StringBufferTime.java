package inputstreamreader.challenge_problem;

public class StringBufferTime {
    static long startTime,endTime;

    public static long bufferTime(){
        StringBuffer sbf=new StringBuffer();
        startTime=System.nanoTime();
        for(int i=0;i<=1000000;i++){
            sbf.append("hello");
        }
        endTime=System.nanoTime();
        long l = endTime - startTime;
        return l;
    }
}
