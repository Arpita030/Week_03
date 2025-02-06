package inputstreamreader.question_02;

public class Main {
    public static void main(String[] args) {
        String fileName = "user_inputText.txt";
        UserInputReader userInputHandler = new UserInputReader(fileName);
        userInputHandler.readAndWriteInput();
    }
}
