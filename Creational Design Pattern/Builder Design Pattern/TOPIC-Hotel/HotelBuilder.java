//interact with user
public class HotelBuilder{
    private String Starters;
    private String Main;
    private String Drinks;
    private int Quantity;

    public HotelBuilder setStarters(String Starters){
        this.Starters = Starters;
        return this;
    }

    public HotelBuilder setMain(String Main){
        this.Main = Main;
        return this;
    }

    public HotelBuilder setDrinks(String Drinks){
        this.Drinks = Drinks;
        return this;
    }

    public HotelBuilder setQuantity(int Quantity){
        this.Quantity = Quantity;
        return this;
    }

    public Hotel getHotel(){
        return new Hotel(Starters , Main ,Drinks, Quantity);
    }
}
