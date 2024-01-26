package Assignment_7;

public class SumOfEvenOdd {

    public static void main(String[] args){
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of the first 10 even numbers: " + evenSum);
        System.out.println("Sum of the first 10 odd numbers: " + oddSum);

    }
}

