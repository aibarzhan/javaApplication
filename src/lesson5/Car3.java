package lesson5;

public class Car3 {
    Car3(String Цвет, String Мотор) {
        color = Цвет;
        engine = Мотор;
        System.out.println("Цвет машины: " + color + "." + " Мотор машины: " + engine);
    }
    String color;
    String engine;

}

class Car3Test{
    public static void main(String[] args) {
        Car3 car1 = new Car3("белый", "1jz-gte");
        Car3 car2 = new Car3("Черный", "1uz");
    }
}
