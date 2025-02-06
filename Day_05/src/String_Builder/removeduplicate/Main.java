package String_Builder.removeduplicate;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicate remover = new RemoveDuplicate();
        String input = "banana";
        String output = remover.removeduplicate(input);
        System.out.println("String after removing duplicates: " + output);
    }
}
