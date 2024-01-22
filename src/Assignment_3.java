import java.util.Scanner;

public class Assignment_3 {
        public static void main(String[] args){
            //Convert Inches to Meters:

            Scanner scanner=new Scanner(System.in);

            System.out.println("Enter a Number in Inches");
            double inches=scanner.nextDouble();

            double meters= 0.0254 * inches;

            System.out.println(inches+" "+"inches equals to "+meters+" "+"meters");


//Write a Java program that reads a number and displays the square, cube, and fourth power.


            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            double square = Math.pow(number, 2);
            double cube = Math.pow(number, 3);
            double fourthPower = Math.pow(number, 4);

            System.out.println("Square: " + square);
            System.out.println("Cube: " + cube);
            System.out.println("Fourth Power: " + fourthPower);

//Check if Four Integers are Equal:

            System.out.print("Input first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Input second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Input third number: ");
            int num3 = scanner.nextInt();
            System.out.print("Input fourth number: ");
            int num4 = scanner.nextInt();

            if (num1 == num2 && num2 == num3 && num3 == num4) {
                System.out.println("Numbers are equal!");
            } else {
                System.out.println("Numbers are not equal!");
            }

//Check if a Number is Even or Odd:

            System.out.print("Enter an integer: ");
            int x = scanner.nextInt();

            if (x % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }

    }



