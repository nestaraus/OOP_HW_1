public class Main {
    public static void main(String[] args) {
       
        HotDrink[] teas = {new Tea("Жасмин", 0.5, 70, 80), new Tea("Черный", 0.5, 90, 80)} ;
        for (HotDrink tea : teas){
            tea.getProduct();
        }
        HotDrink[] cofees = {new Cofe("Cappuchino", 0.3, 130, 60)} ;
        for (HotDrink cofe : cofees){
            cofe.getHeet();
        }
    }
}