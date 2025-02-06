package String_Builder.reverse;

public class Main {
    public static void main(String[] args) {
        ReverseString  reversed=new ReverseString();
        String input = "hello";
        String output = reversed.reverse(input);
        System.out.println("Reversed string: " + output);
    }
}