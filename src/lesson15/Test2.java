package lesson15;

public class Test2 {
    public static void main(String[] args) {
        boolean b = true;
        int i = 1;
        while (b) {
            System.out.println(i);
            if (i % 6 == 0 && i % 9 == 0) { // ЗДесь ЦИКл будет работать до тех пор пока 6 и 9 не будет поделен без остатков
                b = false;                   // После того как if станет TRUE, b станет false прекратиться цикл while          }
            }
            i++;
        }
    }
}
