public class Cofe extends HotDrink {
    private int temperature;
    public Cofe(String name, double volume, int price, int temperature){
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    @Override
    public void getHeet(){
        System.out.println("Кофе " + getName()+ " имеет температуру: "+ getTemperature()+" C^ подогреть?");
    }

    @Override
    public void getProduct(){
        System.out.println("Кофе " + getName()+ " c данным объемом " + getVolume()+ " имеет температуру: " + getTemperature());
    }
    
}
