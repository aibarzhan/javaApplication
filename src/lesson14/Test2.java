package lesson14;

import org.w3c.dom.ls.LSOutput;

public class Test2 {
    public static void time(){
        /*ТАК МОЖЕМ НАЗВАТЬ for */   outer:for (int chas = 0; chas < 24; chas++){  // Проверяется условия первого цикла, если true, передается инициализация на
            System.out.println("Начало первого цикла");  // второй цикл
                 inner:for (int minuta = 0; minuta <= 59; minuta++){  // И выполняется второй цикл пока условие true. Если условие
                   System.out.println(chas + ":" + minuta);   // false инициализация передается на первый цикл обратно
                     if(minuta == 30)
                         break outer;  // ТАК МОЖЕМ ВНУТРИ ВНУТРЕННЕГО ЦИКЛА ПРЕРВАТЬ РАБОТУ ВНЕШНЕГО ЦИКЛА ЧЕРЕЗ LABELED STATMENT
                   }

                      System.out.println("Конец первого цикла");

        }
    }

    public static void main(String[] args) {
            time();

    }
}