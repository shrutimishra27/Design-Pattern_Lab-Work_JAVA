
public class Hotel {
    private String Starters;
    private String Main;
    private String Drinks;
    private int Quantity;

    public Hotel(String Starters , String Main , String Drinks , int Quantity){

        super();
        this.Starters  = Starters;
        this.Main = Main;
        this.Drinks = Drinks;
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Hotel[Starters="+ Starters + ",Main="+ Main + ", Drinks="+ Drinks + ", Quantity="+ Quantity + "]";
    }
}
