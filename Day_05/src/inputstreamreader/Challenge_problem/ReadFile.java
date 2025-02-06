package inputstreamreader.challenge_problem;

import java.io.*;

public class ReadFile {
    public static long[] reader() {
        long startTime=0,endTime=0;
        int count=0;
        long[] arr =new long[2];
        StringBuffer sb=new StringBuffer();
        try(BufferedReader br=new BufferedReader(new FileReader("src/largetextfile.txt"))){
            String line;
            startTime=System.nanoTime();
            while((line=br.readLine())!=null){
                sb.append(line).append(" ");
            }
            String temp=sb.toString();
            String [] words=temp.split("\\s+");

            for(String string:words){
                count++;
            }
            arr[0]=count;
            endTime=System.nanoTime();
            arr[1]=endTime-startTime;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arr;
      }
}
