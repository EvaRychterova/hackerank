package ThirtyDaysOfCode.Day3;

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();


        String weird = "Weird";
        String notWeird = "Not Weird";
        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println(notWeird);
            }
            if (N >= 6 && N <= 20) {
                System.out.println(weird);
            }
            if (N > 20) {
                System.out.println(notWeird);
            }
        } else
            System.out.println(weird);

    }
}