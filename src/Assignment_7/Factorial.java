package Assignment_7;

import java.util.Scanner;

public class Factorial {
    static int Factorial (int num2){
        if(num2==0){
            return 1;
        }
        else{
            return(num2*Factorial(num2-1));
        }
    }
    public static void main (String[] args){
        double fact =1;
        System.out.println("Enter any Number to get the factorial: ");
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        for(double i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+num+" is: "+fact);
    }

}
