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
       public static void main(String[] args) {
            System.out.println("Enter Any Number :");
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            Table Obj1 = new Table();
            Obj1.Multiply(num1);

        }

}
/*List<Integer> list = new ArrayList<>();
            for (int i = 0; i <= 10; i++) {
                list.add(i);

            }
           System.out.println(list);

          List<Integer> l1= list.stream().filter(n->n%2==0).collect(Collectors.toList());
            System.out.println(l1.stream().map(n->n+2).reduce());*/