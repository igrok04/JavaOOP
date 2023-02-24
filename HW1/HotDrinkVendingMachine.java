package HW1;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine {
    private ArrayList<HotDrink> drinkList;

    public HotDrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        drinkList = new ArrayList<HotDrink>();
    }
    public void addDrink(HotDrink hdr){
        drinkList.add(hdr);
    }
    public Drink returnProduct(String name){
        for (Drink el: drinkList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }
    
    
    @Override
    private void getProduct(String name, double volume, double temperature){
        HotDrink product;
        if (product instanceof HotDrink){ 
            HotDrink ht = (HotDrink) product;
    }

    public void getHotDrink(Object name, Object volume, Object temperature) {
    }
}