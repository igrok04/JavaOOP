/**
•	- Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
•	
•	- Создать класс HotDrinkVendingMachine наследника VendingMachine и реализовать перегруженный
•	 метод getProduct(String name, double volume, double temperature), выдающий продукт соответствующего 
•    имени, объема и температуры. Используйте при итерации конструкцию if (product instance of HotDrink)
•    { HotDrink ht = (HotDrink) product; }.
•	- В main проинициализировать несколько экземпляров HotDrink и один HotDrinkVendingMachine и воспроизвести 
•	 логику заложенную в программе.
•    Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре/ 
 */

package HW1;

import java.util.ArrayList;

public class Problem1 {
    private static String drinks;

    public static void main(String[] args) {
        VendingMachine firstMachine = new VendingMachine("first machine");

        Product first = new Product("орешки", 100);
        firstMachine.addProduct(first);
        Product second = new Product("газировка", 150);
        firstMachine.addProduct(second);

        Drink firstDrink = new Drink("яблочный сок", 150);
        firstDrink.setVolume(100);
        Drink secondDrink = new Drink("кола", 200);
        secondDrink.setVolume(150);

        Drink firstHotDrink = new HotDrink("кофе", 100, 80);
        firstHotDrink.setVolume(100);
        firstHotDrink.setTemperature(80);
        Drink secondHotDrink = new HotDrink("какао", 150, 90);
        secondHotDrink.setVolume(150);
        secondHotDrink.setTemperature(80);
        ArrayList<Product> products = new ArrayList<>();
        products.add(first);
        products.add(second);
        products.add(firstDrink);
        products.add(secondDrink);
        products.add(firstHotDrink);
        products.add(secondHotDrink);
        for (Product el : products) {
            el.consume();
            HotDrinkVendingMachine secondMachine = new HotDrinkVendingMachine(drinks);

            secondMachine.getHotDrink(getName(), getVolume(), getTemperature());
        }
    }

    private static Object getTemperature() {
        return null;
    }

    private static Object getVolume() {
        return null;
    }

    private static Object getName() {
        return null;
    }
}