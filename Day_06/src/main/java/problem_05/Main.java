package problem_05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursive Fibonacci Performance :");
        RecursiveFibonacci.checkPerformance(10);
        RecursiveFibonacci.checkPerformance(30);
        RecursiveFibonacci.checkPerformance(50);
        System.out.println();

        System.out.println("Iterative Fibonacci Performance :");
        IterativeFibonacci.checkPerformance(10);
        IterativeFibonacci.checkPerformance(30);
        IterativeFibonacci.checkPerformance(50);

    }
}
