package Java.Strings;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0 ; i <= s.length() -  k ; i++) {
            String subStr = s.substring(i, i + k);

            if (smallest.compareTo(subStr) >= 1) {
                smallest = subStr;
            } else if (largest.compareTo(subStr) <= -1) {
                largest = subStr;
            }

        }
            return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
