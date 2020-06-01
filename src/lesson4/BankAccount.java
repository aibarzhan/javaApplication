package lesson4;

public class BankAccount {
    int id;              //Создали класс BankAccount
    String name;        // Создали примитивные типы данных и переменные
    double balans;


}
class BankTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();   //Здесь создали обьект и присвоили ему переменные MyAccount который
        BankAccount YourAccount = new BankAccount(); // содержать в себе адрес памяти который лежит обьект new BankAccount
        BankAccount HisAccount = new BankAccount();
        BankAccount bA = HisAccount;
        MyAccount.id = 1;
        MyAccount.name = "Aibar";
        MyAccount.balans = 428.500;

        YourAccount.id = 2;
        YourAccount.name = "Perizat";
        YourAccount.balans = 87.500;

        HisAccount.id = 3;
        HisAccount.name = "Raushan";
        HisAccount.balans = 150.500;

        System.out.println(MyAccount.name);

        lesson6.homeWorkStudent st5 = new lesson6.homeWorkStudent(7, "Dulatov", "3 course");
        System.out.println(st5.id + " " + st5.surname + " " + st5.course);
    }
}
