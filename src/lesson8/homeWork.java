package lesson8;

import jdk.swing.interop.SwingInterOpUtils;

public class homeWork {
    public static final double pi = 3.14;

    public double method1(double radius) {
        double area1 = pi * radius * radius;
        return area1;
    }

    public static double method2(double radius1) {
        double area2 = 2 * pi * radius1;
        return area2;
    }

    public  void method3(double radius3) {
        System.out.println("Радиус: " + radius3);
        System.out.println("Площадь круга: " + method1(6));
        System.out.println("Длина окружности: " + method2(8));
    }

}
class homeWorkTest{

    public static void main(String[] args) {
        homeWork aa = new homeWork();
        aa.method3(20);

    }
}
