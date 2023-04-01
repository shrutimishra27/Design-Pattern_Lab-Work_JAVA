package builder;

//Here the actual object w
public class eSport_builder {

    private String name1;
    private String name2;
    private int price;

    //setter method: set value of the instance variable
    public eSport_builder setName1(String name1) {
        this.name1 = name1;
        return this;
    }

    public eSport_builder setName2(String name2) {
        this.name2 = name2;
        return this;
    }

    public eSport_builder setPrice(int price) {
        this.price = price;
        return this;
    }

    // getter method to return the value of instance variable
    public eSport getEsport(){
       return new eSport(name1,name2, price);
    }
}
