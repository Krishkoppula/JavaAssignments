package Assignment_9;

 class Vehicle1 {
     void drive(){
        System.out.println("Print Vehicle");
    }
}
 class Car extends Vehicle{
     void drive(){
        System.out.println("Print car");
    }

}
public class Vehicle
{
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.drive();
    }

}
