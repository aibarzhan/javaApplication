package lesson9;

public class Car {
   public String color;
   public static String engine;
    static int count;
    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }
    public void showColor(){
        System.out.println("Цвет машины: " + color);
        changeColor("white");
    }
    public void changeColor(String color){
        System.out.println("Цвет машины изменился на " + color);
        int cena = 5000;
        this.color = color;
        cena += 1000;

    }
}
class CarTest{
    public static void main(String[] args) {
        Car a = new Car("blue", "1jz-gte");
        System.out.println(a.color + "/" + a.engine);
        a.showColor();
        a.changeColor("red");


    }

}
