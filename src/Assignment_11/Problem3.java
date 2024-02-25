package Assignment_11;

public class Problem3 {
    public static void main(String[] args) {
        String input1 = "java";
        String input2 = "amma";

        System.out.println(isPalindrome(input1) ? "Palindrome" : "Not Palindrome");
        System.out.println(isPalindrome(input2) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
