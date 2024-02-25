package Assignment_11;

public class Problem1 {
    public static void main(String[] args) {
        String input1 = "123";
        String input2 = "678";

        int sum1 = sumOfDigits(input1);
        int sum2 = sumOfDigits(input2);

        System.out.println("Sum of digits in " + input1 + ": " + sum1);
        System.out.println("Sum of digits in " + input2 + ": " + sum2);
    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}
