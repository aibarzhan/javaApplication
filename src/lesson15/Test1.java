package lesson15;

import org.w3c.dom.ls.LSOutput;

public class Test1 {
    public static void main(String[] args) {
        int a = 100;
        while (a > 0){
            System.out.println("Делайте ставки");
            int b = 10;
            a = a - b;
            System.out.println("Вы проиграли. У вас сняли " +  b+"$." + "На счету осталось: " + a);

        }
        System.out.println("У вас не осталось денег");
    }
}
