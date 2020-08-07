package lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uveli4itel(double a) {  /* В этом методе сама зарплата не храниться удвоенным а лишь удваивается и
                                              храниться в переменный который мы создали */
        a = a * 2;
        System.out.println(salary);
        return a;
    }

    public double zp2(){           // В этом методе зарплата реально увеличивается и остается удвоенным
        salary = salary * 2;
        return salary;
    }
}
    class EmployeeTest {
        public static void main(String[] args) {
        Employee emp1 = new Employee("Aibar", 98.500);
           double result = emp1.uveli4itel(emp1.salary);
            System.out.println(result);
            emp1.zp2();
            System.out.println(emp1.salary);

        }
    }

