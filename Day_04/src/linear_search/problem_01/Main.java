package linear_search.problem_01;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 3, -4, 7, 10};

        int index = FirstNegativeNumber.negativenumber(arr);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println(index);
        }
    }
}