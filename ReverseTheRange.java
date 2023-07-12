package reverseTheRange;

import java.util.Scanner;

public class ReverseTheRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = scanner.nextInt();
        System.out.println("Enter Elements into the Array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter start value: ");
        int start = scanner.nextInt();
        System.out.println("Enter End value: ");
        int end = scanner.nextInt();
        scanner.close();
        ReverseTheRange reversetherange = new ReverseTheRange();
        reversetherange.reverse(array, size, start, end);

    }

    public void reverse(int array[], int size, int start, int end) {
        int temporary;
        while (start < end) {
            temporary = array[start];
            array[start] = array[end];
            array[end] = temporary;
            start++;
            end--;

        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
