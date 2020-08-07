package lesson12;




public class test10 {
    String color;
    String engine;
    test10 ( String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    void maximum(int a, int b, int c){   // Это метод вычисляет максимальный число из трех чисел
        String max = "Максимум: ";
        if(a > b && a > c){
            System.out.println(max + a);

        } else if(b > a && b > c){
            System.out.println(max + b);

        }else
            System.out.println(max + c);
    }
     static void prisvoit(){
        String str;                    // Это метод просто присвоит значение к переменным str в согласно с условием
        int a = 18;
        if(a > 10) {
            str = "a больше 10. а = " + a;
        }else if(a < 10){
            str = "a меньше 10. а = " + a;
        }else{
            str = "a равно 10. a = " + a;}
        System.out.println(str);
    }

}
class testTest{
    public static void main(String[] args) {
        test10 car1 = new test10("black", "1jz-ge");
        test10 car2 = new test10("black", "1jz-ge");
        String s1 = new String("abc");
        String s2 = new String("abc");
        if(s1.equals(s2)){
            /* с методом equals() можно сравнивать ссылочные типы данных. В случае с обьектом класса String отдельно
            создавать метод equals() не нужно */

            System.out.println("if правильно");
        }
        else
            System.out.println("else правильно");
        System.out.println(s1.equals(s2)); // Это равно к true;

        car1.maximum(5, 6, 9);

        test10.prisvoit();
    }
}

