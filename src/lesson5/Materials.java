package lesson5;

import java.awt.event.MouseAdapter;

public class Materials {
    Materials(String имя, String размер, int количество, int цена){
        name = имя;
        size = размер;
        quantity = количество;
        price = цена;
        fullpriceofitem = quantity * price;
        System.out.println(name + size + fullpriceofitem);
    }
    String name;
    String size;
    int quantity;
    int price;
    int fullpriceofitem;

}
class objectOfMaterials{
    public static void main(String[] args) {
        Materials stoika = new Materials("Стоика,", "50x50, т 2,", 18, 6000);
        Materials ugolok = new Materials("Уголок,", "40x20, т 1.5,", 30, 2400);
        Materials profnastil = new Materials("Профнастил,", "6x1,", 30, 9000);

    }
}