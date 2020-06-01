package lesson2;

public class operatorAssignments {
    public static void main (String [] args){
        int a = 5;
        a += 3; // это сокращенный вариант a = a + 3
        System.out.println(a); //результат будет 8
        int b = 21;
        b /= 5;
        System.out.println(b);

        int c = 3;
        int d = 9;
        int e = 7;
        c = d = e = 13;
        System.out.println(c); // Вэтом случае обе переменные c и d будет равно значением e;
        System.out.println(d); // Или на 18 который принимает последнее значение;

        //  long lon = 100L;   Этот код будет неправильным, потому что type int не может принимать значение типа long,
       // int k = lon;        так как интервал значение long не может вместиться в int. У него ограничено диапазон.

     int f = 11;                // Здесь f больше или равно g и возвращается true, так как он хоть не больше, но равно
     int g = 11;                //Можно без boolean писать сразу внутри в System.out.print(f >= g);
     boolean c1 = f >= g;
        System.out.println(c1 + " Это результат оператора >=, то есть 'больше или равно'");

     int ab = 23;
     int ac = 23;                      // оператор != означает не равно. В нашем случае 23 ab равно ac поэтому вернули
      boolean am = ab != ac;           // значение false
        System.out.println(am + " Это резуьтат выражение !=, то есть 'не равно'");

                            //ЛОГИЧЕСКИЕ ОПРЕАТОРЫ && (И) и || (ИЛИ)
        boolean b1 = false;
        boolean b2 = true;             //для опреатора &&(И) если хоть один из них будет false то резултат будет false;
        boolean b3 = true;
        boolean result1 = b1 & b2 &b3;
        System.out.println(result1 + " Это результат оператора &&, то есть 'и'");

        boolean b4 = false;
        boolean b5 = false;
        boolean b6 = true;
        boolean result2 = b4 || b5 || b6;
        System.out.println(result2 + " Это резуьтат оператора ||, то есть 'или'");

                           // ОТРИЦАТЕЛЬНОЕ ЗНАЧЕНИЕ !
        boolean as = true;
        boolean aw = false;
        System.out.println(!aw + " 'Результат оператора отрицания !'");

        int df = 10;       // Здесь проверяется сравннение. df реально меньше dd. Должен был быть true. Но так как мы
        int dd = 12;       // перед выражением поставили оператор 'не' нам вернул противопложенный значение, то есть FALSE
        boolean result4 = !(df < dd);
        System.out.println(result4 + " 'Результат оператора отрицания !'");

        int sd = 10;
        int sf = 20;
        int sg = 99;
        int sj = 100; //Если так sl = sd >sf & ++sg == sj; ЗНАЧИТ хоть первая false но второя всеравно выполняется
        boolean sl = sd > sf && ++sg == sj;   // false && true = false
        System.out.println(sl + " Результат оператора '&&'");
        System.out.println(sg + " Результат оператора '&&'");

        int asa = 10;
        int ada = 20;
        int afa = 99;   //aja = asa < ada | ++afa == aha; Здесь хоть первый true второй все равно проверяется
        int aha = 100;
        boolean aja = asa < ada || ++afa == aha;  // false || true = true;
        System.out.println(aja + " Результат оператора '||'");
        System.out.println(afa + " Результат оператора '||'");

        int xx = 65; // В отличий && и ||, с & и | можем иметь дело с числами не только с boolean
        int xxx = 61;
        System.out.println((xx | xxx) + " Результат оператора & и | с числами"); // или System.out.println(xx & xxx);

                            // Оператор ^ равно OR (но с отличием)
        boolean s1 = false;
        boolean s2 = false;  // Для оператора ^ только один из выражений должен быть true, Иначе вернет значение 'false'
        boolean s3 = true;
        boolean s4 = false;
        System.out.println((s1 ^ s3 ^ s2 ^ s4) + " Результат оператора ^");


        char fg = 'a';
        int fj = 10;    // Здесь 'a' равно 97 по юникоду, соответственно 97 + 10 = 107;
        System.out.println(fg + fj + " Результат типа данных char по Unicode");


    }
}
