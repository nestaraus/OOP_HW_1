public class HotDrink {
    private String name;
    private double volume;
    private int price;

    public HotDrink(String name, double volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }


    public String getName(){
        return name;
    }
    

    public Double getVolume(){
        return volume;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void getHeet(){
        System.out.println("Напиток имеет температуру:C^ подогреть?");
    }
    public void getProduct(){
        System.out.println("Напиток c данным объемом имеет температуру:");
    }
}
