package lesson14;

public class Test1 {
    public static void main(String[] args) {

        // Тело цикла for выполняется  и повторяется до тех пор пока условие не станет false
        // то есть       i <3;             Можно использовать несколько перемненных через запятой в цикле for
        for (int i = 0, number = 1, nums = 2, math = 11; i < 10; i++){   // for ( int i = 2, nums = 2, numbers = 3; i <=10; i++)
            System.out.println("Вывести строку 10 раз");
        }
        /* for(int i = 1; i <= 10; i++){
        if(i == 7){
         break;             ЗДЕСЬ ЦИКЛ ЗАВЕРШИТЬСЯ КОГДА i СТАНЕТ РАВНО 7
        }
        System.out.println(i)
        }

        for(int i = 1; i <= 10; i++){
        if(i == 7){
         continue;             ЗДЕСЬ ЦИКЛ ПРОПУСТИТЬ ВЫОЛНЯТЬ ТЕЛО ЦИКЛА КОГДА i = 7;
        }                       ТО ЕСТЬ ПРОПУСТИТЬ ЧИСЛО 7
        System.out.println(i)
        }

         */
    }
    
}
