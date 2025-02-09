package problem_04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoInputStreamReader {
   public static void checkPerformance(String filePath){
       File file = new File(filePath);
       long fileSize = file.length();
       long startTime,endTime;
       try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8")) {
           int i;
           startTime=System.nanoTime();
           while ((i = isr.read()) != -1) { }
           endTime=System.nanoTime();
           System.out.println("Time taken by InputStreamReader to read a file of size "+fileSize/(1024*1024)+" mb is "+(endTime-startTime)/1000000+" ms");
       } catch (IOException e) {
           System.err.println(e.getMessage());
       }
   }
}
