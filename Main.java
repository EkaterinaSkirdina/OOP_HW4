package SeminarsHW.HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine<BottleWater> vmb = new VendingMachine<>();
        List<BottleWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleWater("Cola", 150, 0.5),
                new BottleWater("Sprite", 150, 0.5),
                new BottleWater("Fanta", 150, 0.5),
                new BottleWater("Bon-Aqua", 100, 0.5)));
        vmb.initProduct(bottleList);
        System.out.println(vmb.getProduct("Cola", 0.5));

        System.out.println("--------- ГОРЯЧИЕ НАПИТКИ ---------");
        VendingMachine<HotDrinks> vmHotDrinks = new VendingMachine<>();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", 200, 0.3),
                new HotDrinks("Tea", 100, 0.3),
                new HotDrinks("Cacao", 150, 0.4),
                new HotDrinks("Milk", 100, 0.5)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по параметрам: " + vmHotDrinks.getProduct("Tea", 0.3));
    }
}
