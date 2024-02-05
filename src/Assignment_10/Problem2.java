package Assignment_10;

abstract class Animal{
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal{
    @Override
    void eat() {
        System.out.println("Lion is Eating");
    }

    @Override
    void sleep() {
        System.out.println("Lion is Sleeping");
    }
}
class Deer extends Animal{

    @Override
    void eat() {
        System.out.println("Deer is Eating");

    }

    @Override
    void sleep() {
        System.out.println("Deer is Sleeping");

    }
}
class Tiger extends Animal{

    @Override
    void eat() {
        System.out.println("Tiger is Eating");
    }

    @Override
    void sleep() {
        System.out.println("Tiger is Sleeping");

    }
}
public class Problem2 {
    public static void main(String[] args){
        Tiger T1=new Tiger();
        T1.eat();
        T1.sleep();
        Deer D1=new Deer();
        D1.eat();
        D1.sleep();
        Lion L1=new Lion();
        L1.eat();
        L1.sleep();
    }
}
