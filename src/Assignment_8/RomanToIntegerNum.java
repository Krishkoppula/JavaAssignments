package Assignment_8;

import java.util.Scanner;
public class RomanToIntegerNum {

    public static void main(String[] args) {
        ;// Replace this with the Roman numeral you want to convert
        System.out.println("Enter the Roman number to Convert into Numeric: ");
        Scanner input = new Scanner(System.in);
        String romanNumeral=input.next();
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = getNumericValue(currentSymbol);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static int getNumericValue(char romanSymbol) {
        switch (romanSymbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanSymbol);
        }
    }
}
