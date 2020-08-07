package lesson13;

// switch РАБОТАЕТ ТОЛЬКО С byte, short, int, char, String

public class test1 {
}


class  Student{
    int grade;
    Student(int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student1 = new Student(5);
        switch (student1.grade){
            case 2:
                System.out.println("Ученик двоечник");
                break;
            case 3:
                System.out.println("Ученик троечник");
                break;
            case 4:
                System.out.println("Ученик хорошо учиться");   // Если не ставить break; то следующий тоже будет выполняться
                break;
            default:
                System.out.println("Оценка неверна");  // default без разницы где будет стоит. Все равно он будет выполнятся последний
        }
    }
}

