package stack_and_queues.sliding_window_maximum;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = SlidingWindow.maxSlidingWindow(nums, k);

        System.out.print("Sliding window maximums: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
