package compositeDP;
//this is main class for testing composite objects

public class Music_Shop {
    public static void main(String[] args) {

        Component st1 = new Leaf("Guitar",7000);
        Component st2 = new Leaf("Violin",8500);
        Component pr1 = new Leaf("Drum",8000);
        Component pr2 = new Leaf("Congo",5550);
        Component key1 = new Leaf("Piano",6500);
        Component key2 = new Leaf("Harmonium",7450);

        Composite string = new Composite("STRING");
        Composite percussion = new Composite("PERCUSSION");
        Composite keyboard = new Composite("KEYBOARD");
        Composite allInstruments = new Composite("All_Instruments");

        string.addComponent(st1);
        string.addComponent(st2);
        percussion.addComponent(pr1);
        percussion.addComponent(pr2);
        keyboard.addComponent(key1);
        keyboard.addComponent(key2);

        allInstruments.addComponent(string);
        allInstruments.addComponent(percussion);
        allInstruments.addComponent(keyboard);

        allInstruments.showPrice();
        //string.showPrice();
        //percussion.showPrice();
        //keyboard.showPrice();



    }
}

