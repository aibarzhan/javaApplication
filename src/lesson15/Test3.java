package lesson15;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        while (a++ < 10){ // В ЭТОМ ПРИМЕРЕ В КОНЦЕ ХОТЬ УСЛОВИЕ БУДЕТ FALSE, ВСЕ РАВНО a ВНУТРИ УСЛОВИЙ УВЕЛИЧИТЬСЯ НА Б1
            a++;
        }
        System.out.println(a);
    }
}
