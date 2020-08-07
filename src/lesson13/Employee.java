package lesson13;

import javax.imageio.stream.ImageInputStream;

public class Employee {
    public static void main(String[] args) {
        switch ("Воскресенье"){
            case "Понедельник", "Вторник", "Среда", "Четверг", "Пятница": // Можно так сократить код чтобы каждый раз не создавать case
                System.out.println("Работа с 9:00 до 18:00");
                break;
            case "Суббота":
                System.out.println("Работа с 10:00 до 15:00");
                break;
            case "Воскресенье":
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }

    }
}
