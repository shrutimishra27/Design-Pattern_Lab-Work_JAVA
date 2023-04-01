//Main File
//Hide complex internal sstructure from user who is trying to create an object
//Separate Object construction from its user

public class Restaurant {
    public static void main(String[] args) {
        Hotel h = new HotelBuilder().setDrinks("Minute Maid").setQuantity(20).setStarters(null).getHotel();
        System.out.println(h);
    }
}
