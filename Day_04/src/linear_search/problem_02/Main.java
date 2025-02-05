package linear_search.problem_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {
                "Java is a powerful programming language.",
                "Linear search is a simple algorithm.",
                "Binary search works on sorted array",
                "Data structures help in efficient problem-solving.",
                "The weather is pleasant today."
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to search: ");
        String word = scanner.nextLine();

        String result = SpecificWord.specificword(sentences, word);

        System.out.println("Result: " + result);
        scanner.close();
    }
}
