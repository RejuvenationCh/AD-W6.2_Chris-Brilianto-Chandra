public class PayrollSystem {

        public static void main(String[] args) {   
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
            System.out.println(name);
            System.out.println(getRole());
            System.out.println(calculateSalary());
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
}