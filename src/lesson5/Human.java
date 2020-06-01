package lesson5;

public class  Human {
    String name;
    Car car;
    BankAccount bA;
    void info() {
        System.out.println("Имя: " + name + ". Цвет машины: " + car.color +
                        ". Двигатель машины: " + car.engine +
                ". Баланс банковсого счета: " + bA.balance + ".");

    }
}
class HumanTest{
    public static void main(String[] args) {
         Human human1 = new Human();
         human1.name = "Aibar";
         human1.car = new Car("blue", "1jz-gte");
         human1.bA = new BankAccount(12, 427.200);
         human1.info();
         BankAccount balans1 = human1.bA;
         balans1.showBalans();
         balans1.popolnenie(20);
         balans1.showBalans();




    }
}

class Car{
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    String color;
    String engine;
}
class BankAccount{
    BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
        }
    
    int id;
    double balance;
    double snyatie(int skolko){
    balance = balance - skolko;
    return balance;
}
    double popolnenie(int skolko){
        balance = balance + skolko;
        return balance;
    }
    void showBalans(){
        System.out.println("Баланс : " + balance);

    }
}