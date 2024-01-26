package Assignment_7;

import java.util.Scanner;
public class Table {

    public void Multiply(int num1) {
        int num2;
        for (int i = 1; i <= 10; i++) {
            num2 = num1 * i;
            System.out.println(num2);
        }
    }
        public static void main(String[] args)
        {
            System.out.println("Enter Any Number :");
            Scanner input=new Scanner(System.in);
            int num1 =input.nextInt();
            Table Obj1=new Table();
           Obj1.Multiply(num1);

        }

}
