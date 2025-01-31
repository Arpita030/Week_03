package sorting.mergesort;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] bookPrices = {500, 150, 300, 700, 100, 450};

        System.out.println("Original book prices: " + Arrays.toString(bookPrices));

        Books.mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted book prices: " + Arrays.toString(bookPrices));
    }
}