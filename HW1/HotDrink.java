package HW1;

public class HotDrink extends Drink{
    private int temperature;

    public HotDrink(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public void consume(){
        System.out.println("Горячий напиток выпит");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
   
