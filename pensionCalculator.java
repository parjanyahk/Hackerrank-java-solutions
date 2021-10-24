import java.util.Scanner;

class Employee {
    int Emp_id;
    String Emp_name;
    int Emp_age;
    double Emp_salary;
    double con_employe, con_employer, total;

    //default constructor
    Employee(){
        Emp_id = 22011074;
        Emp_name = "Abc";
        Emp_age = 40;
        Emp_salary = 45000;
    }
    // Constructor
    Employee(int e_id, String e_n, int e_a, double sal) {
        // atrributes=emp_id,emp_name on left hand side
        Emp_id = e_id;
        Emp_name = e_n;
        Emp_age = e_a;
        Emp_salary = sal;
    }

    // public void get_data(){
    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("\nEnter Employee ID :");
    // Emp_id = sc.nextInt();
    // System.out.println("\nEnter Employee name :");
    // Emp_name = sc.next();
    // System.out.println("\nEnter Employee age :");
    // Emp_age = sc.nextInt();
    // System.out.println("\nEnter Employee Salary :");
    // Emp_salary= sc.nextDouble();
    //
    // sc.close();
    // }
    public void calculate_pension() {
        if (Emp_age <= 55) {
            con_employe = Emp_salary * 0.2;
            con_employer = (Emp_salary * 0.17);
        } else if (Emp_age > 55 && Emp_age <= 60) {
            con_employe = Emp_salary * 0.13;
            con_employer = (Emp_salary * 0.17);
        } else if (Emp_age > 60 && Emp_age <= 65) {
            con_employe = Emp_salary * 0.075;
            con_employer = (Emp_salary * 0.09);
        } else {
            con_employe = Emp_salary * 0.05;
            con_employer = (Emp_salary * 0.075);
        }
        total = con_employe + con_employer;
    }

    public void display_data() {
        System.out.println("\nEmployee ID = " + Emp_id);
        System.out.println("Employee Name = " + Emp_name);
        System.out.println("Employee Age = " + Emp_age);
        System.out.println("Employee Salary = " + Emp_salary);
        System.out.println("Employee Pension = " + total);
    }
}

public class pensionCalculator {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter Employee ID :");
        int e_id = sc.nextInt();
        System.out.println("Enter Employee name :");
        String e_n = sc.next();
        System.out.println("Enter Employee age :");
        int e_a = sc.nextInt();
        System.out.println("Enter Employee Salary :");
        double sal= sc.nextDouble();
        
        Employee e1 = new Employee(); 
        Employee e2 = new Employee(e_id,e_n,e_a,sal);
        sc.close();
        e1.calculate_pension();
        System.out.print("\n ***** Details of employee 1 *****");
        e1.display_data();
        e2.calculate_pension();
        System.out.print("\n *****Details of employee 2 ***** ");
        e2.display_data();

        Employee e3 = new Employee();
       e3=e2; //invoking copy constructor
       e3.calculate_pension();
       System.out.print("\n *****Details of employee 3 ***** ");
       e3.display_data();

    }

}
