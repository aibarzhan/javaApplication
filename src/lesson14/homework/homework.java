package lesson14.homework;


public class homework {

    public static void time() {
       outer: for (int hours = 0; hours < 6; hours++) {

        middle: for (int minute = 0; minute <= 59; minute++) {
           if (hours > 1 && minute % 10 == 0){
               break outer;
           }

           inner: for (int second = 0; second <= 59; second++) {

               if (hours * second > minute){
                   continue middle;
               }
                    System.out.println(hours + ":" + minute + ":" + second);

                }

            }

        }
    }
    public static void main(String[] args) {
        time();
    }
}
