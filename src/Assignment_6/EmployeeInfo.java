package Assignment_6;

import java.util.Scanner;

public class EmployeeInfo {
    private String Emp_Name;
    private String Job_Title;
    private double Salary;
    public EmployeeInfo(String Emp_Name,String Job_Title,double Salary){
        this.Emp_Name=Emp_Name;
        this.Job_Title=Job_Title;
        this.Salary=Salary;
    }

    public String getEmp_Name(){
        return Emp_Name;
    }
    public void setEmp_NameName() {
        this.Emp_Name = Emp_Name;
    }
    public String getJob_Title(){
        return Job_Title;
    }
    public void setJob_Title()
    {
        this.Job_Title=Job_Title;
    }
    public double getSalary(){
        return Salary;
    }
    public void setSalary(){
        this.Salary=Salary;
    }
    public void raise_Salary(double Percentage){
        double RaisedSalary = Salary * (Percentage/100);
        Salary = Salary + RaisedSalary;
        System.out.println("Raised Salary After the Increment :"+Salary);
    }
    public void employee_Information(){
        System.out.println("****Employee Information****");
        System.out.println("Employee Name :"+Emp_Name);
        System.out.println("Employee Job Title :"+Job_Title);
        System.out.println("Employee Salary :"+Salary);

    }


    public static void main(String[] args){

        EmployeeInfo obj3= new EmployeeInfo("Saikrishna","Manager",20000);
        obj3.employee_Information();
        System.out.println("Enter the percentage of Increment:" );
        Scanner input = new Scanner(System.in);
        double Percentage_1=input.nextDouble();
        obj3.raise_Salary(Percentage_1);


    }

}
