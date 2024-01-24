package Assignment_6;
public class Employee {
    String name;
    int age;
    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Employee(String name){
        this.name=name;
        System.out.println("Constructor with Empty ");
    }
    public static void main(String[] args){
        Employee obj1 = new Employee("Sai");
        Employee Person = new Employee("Sai",26);
        System.out.println(obj1.name);
        System.out.println("Name:"+Person.name +" and age is:"+Person.age);
    }

}
