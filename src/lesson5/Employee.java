package lesson5;

public class Employee{
    Employee(int id, String surname, int age, int salary,String department ) {
    this.id = id;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
    this.department = department;
    }
    int id;
    String surname;
    int age;
    int salary;
    String department;

 int pluszarplata(){
     salary = salary * 2;
     return salary;
 }
 void ShowInfo(){
     System.out.println("ID: " + id + ". Фамилия: " + surname + ". Должность: " + department + ". Заработная плата: " + salary);
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Dulatov", 28, 98000,"Guest Service");
        Employee employee2 = new Employee(2, "Zhubathanov", 25, 90000, "Front-Office");
        employee1.ShowInfo();
        employee1.pluszarplata();
        employee1.ShowInfo();

    }
}


