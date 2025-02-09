package problem_05;

public class RecursiveFibonacci {
        public static void checkPerformance(int n){
            if(n<45) {
                long startTime, endTime;
                startTime = System.nanoTime();
                fibonacciRecursive(n);
                endTime = System.nanoTime();

                System.out.println("Time taken to find fibonacci using recursion :" + (endTime - startTime) / 1000000 + " ms");
                return;
            }
            System.out.println("Unfeasible!!!");
        }

        public static int fibonacciRecursive(int n) {
            if (n <= 1) return n;
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
}
