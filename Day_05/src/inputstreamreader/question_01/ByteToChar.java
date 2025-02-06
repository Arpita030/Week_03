package inputstreamreader.question_01;

import java.io.*;

public class ByteToChar{
    public static void main(String[] args) {
        String fileName = "src/examples.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);

            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}