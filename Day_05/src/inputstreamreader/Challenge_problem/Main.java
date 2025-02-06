package inputstreamreader.challenge_problem;

public class Main {
    public static void main(String[] args) {
        long bufferTime=StringBufferTime.bufferTime();
        long builderTime=StringBuilderTime.builderTime();

        System.out.println("Time taken by StringBuffer to concatenate 1 million strings :"+bufferTime+" ns");
        System.out.println("Time taken by StringBuilder to concatenate 1 million strings :"+builderTime+" ns");

        long []arr=ReadFile.reader();
        System.out.println("Time taken to read the file: "+arr[1]+" ns\nWord count "+arr[0]);
    }
}
