package lesson5;

public class Test {                    // Создаем шаблон обьекта
    int summ(int a, int b, int c) {    // Создаем переменный summ и указываем параметры
        int result = a * b * c;
        return result;                // Возвращаем результат
    }
    int sredniarifm(int a1, int b1, int c1){
        int result2 = summ(a1, b1, c1) / 3;
        return result2;

    }
}
class test1{
    public static void main(String[] args) {
        Test object = new Test();                      //Cоздаем ноый обьект класса Test
        int summm = object.summ(12, 22, 44);  // Присваеваем аргументы обьекту который хранится в переменный summm
        System.out.println(summm);

        int summa = object.sredniarifm(10,20,30);
        System.out.println(summa);
    }
}