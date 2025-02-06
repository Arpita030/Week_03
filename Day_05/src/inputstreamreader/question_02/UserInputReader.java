package inputstreamreader.question_02;
import java.io.*;

public class UserInputReader {
    private String fileName;

    public UserInputReader  (String fileName) {
        this.fileName = fileName;
    }

    public void readAndWriteInput() {
        try (
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String userInput;
            System.out.println("Enter text to write to the file. Type 'exit' to stop.");

            while (!(userInput = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(userInput);
                bufferedWriter.newLine();
            }

            System.out.println("Input written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
