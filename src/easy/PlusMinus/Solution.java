package easy.PlusMinus;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int countNumbers = arr.length;
        float countPositiveNumbers = 0;
        float countNegativeNumbers = 0;
        float countZeroNumbers = 0;

        for (int i = 0; i < countNumbers; i++) {
            int value = arr[i];
            if (value > 0) {
                countPositiveNumbers = countPositiveNumbers + 1;
            } else if (value < 0) {
                countNegativeNumbers = countNegativeNumbers + 1;
            } else {
                countZeroNumbers = countZeroNumbers + 1;
            }
        }

        System.out.printf("%.06f %n", countPositiveNumbers / countNumbers);
        System.out.printf("%.06f %n", countNegativeNumbers / countNumbers);
        System.out.printf("%.06f %n", countZeroNumbers / countNumbers);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
