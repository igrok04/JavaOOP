package Machines;

import Product.Drink;

public class DrinkMachine<T extends Drink> extends VendingMachine {
    public DrinkMachine(String drinkMachine) {
        super(drinkMachine);
    }

}
