package prototype;
//Full CLoning or copying of instances

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException  {

        InstrumentShop obj1 = new InstrumentShop();  
        obj1.setShopname("MusicGaze Instruments");  
        obj1.LoadData(); 

        InstrumentShop obj2 = obj1.clone();  
        obj2.getInstrument().remove(1);
        obj2.setShopname("Saraswati Instruments");  

        System.out.println(obj1);  
        System.out.println(obj2);
    }
}
