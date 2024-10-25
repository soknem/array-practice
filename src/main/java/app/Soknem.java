package app;

import java.util.Arrays;
import java.util.Random;

public class Soknem {
    public  static  void practice(){

    }

    // 1. One-Dimensional Array

    public static void createArrayPractice1() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

    }

    public static void createArrayPractice2() {
        int[] multiplesOfSeven = new int[1000];
        for (int i = 0; i < multiplesOfSeven.length; i++) {
            multiplesOfSeven[i] = (i + 1) * 7;
        }
        System.out.println(Arrays.toString(multiplesOfSeven));

    }

    public static void assignValueToElementPractice1() {
        int[] numbers = {10, 20, 30, 40};
        numbers[0] = 100;
        System.out.println(Arrays.toString(numbers));

    }

    public static void assignValueToElementPractice2() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i + 2 * i + 1;
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void updateElementPractice1() {
        int[] numbers = {10, 20, 30, 40};
        numbers[2] = 50;
        System.out.println(Arrays.toString(numbers));

    }

    public static void updateElementPractice2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 2; i < numbers.length; i += 3) {
            numbers[i] *= 10;
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void removeElementPractice1() {
        int[] numbers = {1, 2, 3, 4, 5};
        numbers = Arrays.copyOf(numbers, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));

    }

    public static void removeElementPractice2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] newNumbers = Arrays.stream(numbers)
                .filter(num -> num % 2 != 0)
                .toArray();
        System.out.println(Arrays.toString(newNumbers));

    }

    public static void searchForElementPractice1() {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = Arrays.asList(numbers).indexOf(4);
        System.out.println("Index of 4: " + index);

    }

    public static void searchForElementPractice2() {

    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low; // return the insertion point
    }

    public static void elementIterationPractice1() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

    }

    public static void elementIterationPractice2() {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number + " is prime");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }




    public static void arraysClassSortingPractice1() {

    }

    public static void arraysClassSortingPractice2() {

    }

    public static void arraysClassSearchPractice1() {

    }

    public static void arraysClassSearchPractice2() {

    }

    public static void arraysClassCopyOfPractice1() {

    }

    public static void arraysClassCopyOfPractice2() {

    }

    public static void arraysClassCopyOfRangePractice1() {

    }

    public static void arraysClassCopyOfRangePractice2() {

    }

    public static void arraysClassToStringPractice1() {

    }

    public static void arraysClassToStringPractice2() {

    }

    // 3. Multi-Dimensional Array
    public static void createMultiDimArrayPractice1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void createMultiDimArrayPractice2() {
        int[][] matrix = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(100) + 1;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void assignValueToMultiDimElementPractice1() {

    }

    public static void assignValueToMultiDimElementPractice2() {

    }

    public static void updateMultiDimElementPractice1() {

    }

    public static void updateMultiDimElementPractice2() {

    }

    public static void searchForMultiDimElementPractice1() {

    }

    public static void searchForMultiDimElementPractice2() {

    }

    public static void multiDimElementIterationPractice1() {

    }

    public static void multiDimElementIterationPractice2() {

    }



}
