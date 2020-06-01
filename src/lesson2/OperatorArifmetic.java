package lesson2;

public class OperatorArifmetic {
    public static void main(String [] args){
        int a = 5;
        int b = a * 2; //В этом случае b будет равно a, и будет умножен на 2
        int z = 3, x = 1, c = 3; //Можно так сразу присвоить значение в одно поле
        int t = 11;
        int k = 3;
        int celaya = t/k;
        int ostatok = t%k; // дает результат остатка после деление
        System.out.println(celaya);
        System.out.println(ostatok);

        int p = 10;
        int l =4;         // Если int m = p - l++ Значит (p - l) + 1
        int m = p - ++l; //  Если int m- ++l то Значит p - (1 + l)
        System.out.println(m);
        System.out.println(l);

        int n = 5;
        int g = ++n - --n - n-- + n++;
        System.out.println(g);
    }


}
