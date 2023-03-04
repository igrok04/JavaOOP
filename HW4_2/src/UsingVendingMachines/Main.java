package UsingVendingMachines;

import Machines.DrinkMachine;
import Machines.HotDrinksVendingMachine;
import Machines.VendingMachine;
import Product.Drink;
import Product.HotDrink;
import Product.Product;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendMachine = new VendingMachine("Father Vending machine");
        Product nuts = new Product("орешки", 100);
        Product cola = new Product("кола", 150);
        vendMachine.addProduct(nuts);
        vendMachine.addProduct(cola);

        // String newStr = vendMachine.returnProduct("орешки").getName();
        // Integer newPrice = vendMachine.returnProduct("орешки").getPrice();
        // System.out.println(newPrice+" "+newStr);
        DrinkMachine drinkVM = new DrinkMachine("напитки");
        Drink appleJuiceDrink = new Drink("сок яблоко", 100);
        appleJuiceDrink.setVolume(100);
        Drink cherryJuiceDrink = new Drink("сок вишня", 150);
        cherryJuiceDrink.setVolume(150);
        drinkVM.addProduct(appleJuiceDrink);
        drinkVM.addProduct(cherryJuiceDrink);

        HotDrinksVendingMachine hotDrinksVM = new HotDrinksVendingMachine("горячие напитки");
        HotDrink capuchinoHotDrink = new HotDrink("капуччино", 210);
        capuchinoHotDrink.setTemperature(70);
        capuchinoHotDrink.setVolume(150);
        HotDrink latteHotDrink = new HotDrink("latte", 190);
        latteHotDrink.setTemperature(70);
        latteHotDrink.setVolume(150);
        hotDrinksVM.addProduct(latteHotDrink);
        hotDrinksVM.addProduct(capuchinoHotDrink);

        vendMachine.addProduct(appleJuiceDrink);
        vendMachine.addProduct(cherryJuiceDrink);
        vendMachine.addProduct(latteHotDrink);
        vendMachine.addProduct(capuchinoHotDrink);

        vendMachine.printProducts();
        drinkVM.printProducts();
        hotDrinksVM.printProducts();

        for (int i = 0; i < vendMachine.getProductList().size(); i++) {
            vendMachine.getProductFromVM(i).consume();
        }

    }
}