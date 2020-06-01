package lesson4;

public class Car {
    String color = "red";
    String engine = "V6";

}
class CarTest{
    public static void main(String [] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "blue";
        car1.engine = "2jz-ge";


        System.out.println("Мотор машины: " + car1.engine);
        System.out.println("Цвет машины: " + car1.color);
    }
}
