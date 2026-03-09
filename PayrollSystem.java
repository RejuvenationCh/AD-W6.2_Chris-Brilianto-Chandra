import java.text.DecimalFormat;
public class PayrollSystem {

        public static void main(String[] args) {   

        Employee[] employees = new Employee[4];
            employees[0] = new Manager("Alya", 5000000);
            employees[1] = new Programmer("Budi", 4000000);
            employees[2] = new Programmer("Citra", 4500000);
            employees[3] = new Intern("Dina", 2000000);

        
            double totalPayroll = 0;


            for (Employee employee : employees) {
                employee.printInfo();
                System.err.println();
                totalPayroll += employee.calculateSalary();
            }
            DecimalFormat df = new DecimalFormat("#,###.0");
            System.out.println("Total Payroll : " + df.format(totalPayroll));
            System.out.println();
       
}
}

class Employee {
    public String name;
    public double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
        public void printInfo() {
            System.out.println("Name : " + name);
            System.out.println("Role : " + getRole());
            System.out.println("Salary : " + calculateSalary());
         }
         
         public String getRole() {
            return "Employee";
         }
        public double calculateSalary() {
            return baseSalary;
        }
}

class Manager extends Employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary + 2000000;
    }
    @Override
    public String getRole() {
        return "Manager";
}
}
class Programmer extends Employee {
    public Programmer(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary + 1000000;
    }
    @Override
    public String getRole() {
        return "Programmer";
    }
}

class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary + 300000;
    }
    @Override
    public String getRole() {
        return "Intern";
    }
}

