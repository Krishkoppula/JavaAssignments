package Assignment_11;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String 1: ");
        String str1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the String 2: ");
        String str2 = scanner.nextLine().toLowerCase();

        if (areAnagrams(str1, str2)) {
            System.out.println("Anagram strings");
        } else {
            System.out.println("Not Anagram strings");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
