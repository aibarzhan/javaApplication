package lesson5;
                           // OverLoaded КОНСТРУКТОРЫ
public class EmployeeConstructor {
    EmployeeConstructor(int id, String surname, int age){
       this(id, surname, age, 0.0, null); // Это наследует с 3-го конструктора
    }
    EmployeeConstructor(String surname, int age){           //Это наследует с 1 гоконструктора
        this(0, surname, age, 0.0, null);
    }
    EmployeeConstructor(int id, String surname, int age, double salary, String departament){
        this.id = id;               //This исползуется чтобы каждый раз не повторить конструктор, то есть вызывает
        this.surname = surname;     // конструктор внутри конструктора
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }

    int id;
    String surname;
    int age;
    double salary;
    String departament;

}
class EmployeeConstructorTest{
    public static void main(String[] args) {
        EmployeeConstructor emp1 = new EmployeeConstructor(1, "Dulatov", 28);
            System.out.println(emp1.id + " | " + emp1.surname + " | " + emp1.age);
        EmployeeConstructor emp2 = new EmployeeConstructor("Ivanov", 44);
            System.out.println(emp2.surname + " | " + emp2.age);
        EmployeeConstructor emp3 = new EmployeeConstructor(3, "Baranov", 23, 80000, "Front-Office");
        System.out.println(emp3.id + " | " + emp3.surname + " | " + emp3.age + " | " + emp3.departament);
    }
}
