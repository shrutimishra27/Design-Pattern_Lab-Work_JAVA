//Main File
//Hide complex internal sstructure from user who is trying to create an object
//Separate Object construction from its user

public class MusicInstrument {
    public static void main(String[] args) {
        Instrument h = new InstrumentBuilder().setWarranty(2).setFeature("Clicks-Buttons").setType("Keyboard").getInstrument();
        System.out.println(h);
    }
}
