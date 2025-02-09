package problem_05;

public class IterativeFibonacci {
    public static void checkPerformance(int n){
        double startTime,endTime;
        startTime=System.nanoTime();
        fibonacciIterative(n);
        endTime=System.nanoTime();

        System.out.println("Time taken to find fibonacci using iteration :"+(endTime-startTime)/1000000+" ms");
    }

    public static void fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
