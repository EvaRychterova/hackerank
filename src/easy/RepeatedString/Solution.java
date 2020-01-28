package easy.RepeatedString;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the repeatedString function below.
    private static long repeatedString(String s, long n) {
        long count;
        long lengthInputString = s.length();

        if (s.contains("a")) {
            if (s.length() == 1) {
                count = n;
            } else {
                long multiple = n / lengthInputString;
                String partString = s.substring(0, (int) (n % lengthInputString));

                long countCharAInSubstring = s.chars().filter(ch -> ch == 'a').count();
                long countCharAInPartString = partString.chars().filter(ch -> ch == 'a').count();

                count = multiple * countCharAInSubstring + countCharAInPartString;
            }

        } else {
            count = 0;
        }

        System.out.println(count);
        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH") + "//repeatedString.txt"));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}