
import java.util.Scanner;
import java.lang.String;

public class Assignment_5 {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);


        // Integer To String
        System.out.println("Enter a Integer 1 ");
        int a= input.nextInt();
        System.out.println("Enter a Integer 2");
        int b=input.nextInt();
        String result = String.valueOf(a);
        String result1 = String.valueOf(b);
        System.out.println("Integer to String: "+(result+result1));

        // String to Integer
        System.out.println("Enter a String 1");
        String name = input.next();
        System.out.println("Enter a String 2 ");
        String name_1 = input.next();
        int x=Integer.parseInt(name);
        int y=Integer.parseInt(name_1);
        System.out.println("String to Integer:"+(x+y));

        //String to Float
        System.out.println("Enter a String 3");
        String name_2 = input.next();
        System.out.println("Enter a String 4");
        String name_3= input.next();
        float z=Float.parseFloat(name_2);
        float w=Float.parseFloat(name_3);
        System.out.println("String to Float:"+(z-w));

        //Double to String
        System.out.println("Enter a Double 1");
        double p = input.nextDouble();
        System.out.println("Enter a Double 2");
        double q= input.nextDouble();
        String r=Double.toString(p);
        String s=Double.toString(q);
        System.out.println("Double to String:"+(r+s));





    }

}
