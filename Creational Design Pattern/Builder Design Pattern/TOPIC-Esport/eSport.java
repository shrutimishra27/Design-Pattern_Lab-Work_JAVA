package builder;

//Class for creating the variables for the games name and price
// And for their representation in String format
public class eSport {
    //name of 2 games in Gaming Device
    private String name1;//required parameter
    private String name2;//optional parameter for our case
    private int price; //required parameter


    //Constructor : Create object and take parameters required to create object
    public eSport(String name1, String name2, int price) {
        super();
        this.name1 = name1;
        this.name2 = name2;
        this.price = price;
    }

    //String representation of the object by toString() method
    @Override
    public String toString() {
        return "eSport" + "{" + "name1='" + name1 + '\'' + ", name2='" + name2 + '\'' + ", price=Rs" + price + '}';
    }
}

