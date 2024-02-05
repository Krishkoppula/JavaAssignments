
package Assignment_10;

abstract class Person{
    abstract void eat(String s1);
    abstract void exercise(String s2);
}
class Athlete extends Person{
    @Override
    void eat(String s1) {
        System.out.println(s1+" is Eating");
    }

    @Override
    void exercise(String s2) {
        System.out.println(s2+" is ready to do exercise");
    }
}
class LazyPerson extends Person{

    @Override
    void eat(String s1) {
        System.out.println(s1+" is Eating");

    }

    @Override
    void exercise(String s2) {
        System.out.println(s2+" is ready to do exercise");

    }
}

public class Problem3 {
    public static void main(String[] args){
        LazyPerson L1=new LazyPerson();
        L1.eat("Lilly");
        L1.exercise("Lilly");
        System.out.println();
        Athlete A1=new Athlete();
        A1.eat("Dhoni");
        A1.exercise(" Dhoni");

    }
}
