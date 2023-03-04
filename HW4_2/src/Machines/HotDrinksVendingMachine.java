package Machines;

import Product.HotDrink;

public class HotDrinksVendingMachine<T extends HotDrink> extends VendingMachine {

    public HotDrinksVendingMachine(String hotDrinkMachineName){
        super(hotDrinkMachineName);
    }

}
