package Assignment_9;
class Employee{
    void work(){
        System.out.println("Employee is working");
    }
    void getSalary(){
        System.out.println("Employee will get Salary");
    }
}
class HrManager extends Employee{
    void work(){
        System.out.println("Hr Manager Is working");
    }
    void addEmployee(){
        System.out.println("He/She can add new employee");
    }
    void getSalary(){
        System.out.println("HR will get Salary");
    }
}


public class EMP {
    public static void main(String[] args){
        Employee person1=new HrManager();
        person1.work();
        person1.getSalary();
        HrManager person2=new HrManager();
        person2.addEmployee();
        person2.work();
        person2.getSalary();
    }
}
