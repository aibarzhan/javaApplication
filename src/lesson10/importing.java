package lesson10;

import static lesson4.Car.a; // Можно так импортировать отдельные static переменные или можно все static элементы
// со *; в конце

import lesson6.homeWorkStudent; // Так можем импортровать по отдельным классам.

import lesson6.homewoek.*;  // чтобы каждый раз не писать lesson6.homework.homeWorkStudent test = new lesson6.homework.homeWorkStudent():

import lesson5.*; // Так мы можем импортировать сразу все классы данного пакета;


public class importing {




    public static void main(String[] args) {
        homeWorkStudent test = new homeWorkStudent(4, "Akilbay", "3-курс"); /* Мы создали обьект test
                                                                            класса homeWorkStudent из пакета lesson6 */

        lesson6.homewoek.Test name = new lesson6.homewoek.Test(); /* Здесь мы писали полный путь к классу, так как
                                                                  встречаются другие классы Test в другом пакете */
        name.name = "Aibar";
        System.out.println(name.name);

        Employee employee3 = new Employee(4, "Dulatov", 28, 98000, "laundry");

        System.out.println(a); /* Вот так можем вывести переменный из другого пакета без создание обьекта
                                с помощью присваевание static к переменным */




    }
}
