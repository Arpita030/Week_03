package string_buffer.problem_01;


public class Main {
    public static void main(String[] args) {
        ConcatenateString concatenator = new ConcatenateString();
        String[] inputArray = {"Hello", " ", "World", "!"};
        String result = concatenator.concatenate(inputArray);
        System.out.println("Concatenated string: " + result);
    }
}
