package lesson11.homework;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Car {
    String color;
    String engine;
    public static int countDoor;

    Car(String color, String engine, int countDoor){
        this.color = color;
        this.engine = engine;
        Car.countDoor = countDoor;
    }
        void setColor(String color){
        this.color = color;
            System.out.println(color);
    }

}

class CarTest{
    public static void changeCountDoor(Car c, int countDoor) {
        c.countDoor = countDoor;

    }

void changeColor(Car c1, Car c2){
    String color = c1.color;
    c1.color = c2.color;
    c2.color = color;
}

    public static void main(String[] args) {
       CarTest ct = new CarTest();
       Car car1 = new Car("red", "1jz", 9);
       Car car2 = new Car("blue", "3s-fe", 5);
        System.out.println(car1.engine + car1.countDoor);
        System.out.println(car1.countDoor);
        System.out.println(car1.color + " / " + car2.color);
        System.out.println(car2.countDoor);
        System.out.println(car1.color);
        car1.setColor("Синий");


    }
}

