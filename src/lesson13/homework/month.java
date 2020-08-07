package lesson13.homework;

public class month {

    static void daysOfMonth(int monthNumber){
        switch (monthNumber){
            case 1:
                System.out.println("Январь. 31 дней");
                break;
            case 2:
                System.out.println("Февраль. 28 дней");
                break;
            case 3:
                System.out.println("Март. 31 дней");
                break;
            case 4:
                System.out.println("Апрель. 30 дней");
                break;
            case 5:
                System.out.println("Май. 31 дней");
                break;
            case 6:
                System.out.println("Июнь. 30 дней");
                break;
            case 7:
                System.out.println("Июль. 31 дней");
                break;
            case 8:
                System.out.println("Август. 31 дней");
                break;
            case 9:
                System.out.println("Сентябрь. 30 дней");
                break;
            case 10:
                System.out.println("Октябрь. 31 дней");
                break;
            case 11:
                System.out.println("Ноябрь. 30 дней");
                break;
            case 12:
                System.out.println("Декабрь. 31 дней");
                break;
            default:
                System.out.println("Такой месяц не существует");
        }

    }

    public static void main(String[] args) {
        daysOfMonth(2);
        daysOfMonth(22);

    }
}
