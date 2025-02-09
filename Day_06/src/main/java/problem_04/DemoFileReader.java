package problem_04;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
    public static void checkPerformance(String filePath){
        File file = new File(filePath);
        long fileSize = file.length();
        long startTime,endTime;
        try (FileReader fr = new FileReader(filePath)) {
            int i;
            startTime=System.nanoTime();
            while ((i = fr.read()) != -1) {}
            endTime=System.nanoTime();

            System.out.println("Time taken by FileReader to read a file of size "+fileSize/(1024*1024)+" mb is "+(endTime-startTime)/1000000+" ms");

        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
