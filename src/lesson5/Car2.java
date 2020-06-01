package lesson5;

public class Car2 {
    Car2(){}
 String color;
 String  engine;
 int speed;

 int gaz(int skorost){
     speed += skorost;
     return speed;
 }
 int tormoz(int skorost){
     speed -= skorost;
     return  speed;
 }
 void showInfo(){
     System.out.println("cvet " + color + " motor " + engine + " skorost " + speed);
 }
}
class Car2Test{
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        car1.color = "white";
        car1.engine = "1jz-gte";
        car1.speed = 60;
        car1.tormoz(10);
        car1.showInfo();
        car1.gaz(23);
        car1.showInfo();

    }
}

