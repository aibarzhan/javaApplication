package lesson5;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers of array");
        int[] a;
        int n;
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a [" + i + "] = ");
            a[i] = in.nextInt();
            System.out.println("Вы ввели: " + a[i]);
        }
    }
}





