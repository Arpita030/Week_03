package stack_and_queues.sortingofstack;

import java.util.Stack;

public class SortStackRecursively {
    public static void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int top = s.pop();
            sort(s);
            insertInSortedOrder(s, top);
        }
    }

    public static void insertInSortedOrder(Stack<Integer> s, int element) {
        if (s.isEmpty() || s.peek() <= element) {
            s.push(element);
            return;
        }
        int temp = s.pop();
        insertInSortedOrder(s, element);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println("Original Stack: " + s);
        sort(s);
        System.out.println("Sorted Stack: " + s);
    }
}
