package prototype;

import java.util.ArrayList;  
import java.util.List; 

public class InstrumentShop {  

    private String shopname;  
    List < InstrumentItem > items = new ArrayList<>(); 

    //for Shopname
    public String getShopname() {  
        return shopname;  
    }  

    public void setShopname(String shopname) {  
        this.shopname = shopname;  
    }  

    //for Instrument
    public List < InstrumentItem > getInstrument() {  
        return items;  
    }  

    public void setInstrument(List < InstrumentItem > items) {  
        this.items = items;  
    }  

    public void LoadData() {  
        for (int i = 1; i <= 5; i++) {  
            InstrumentItem Iobj = new InstrumentItem();  
            Iobj.setIid(i);  
            Iobj.setIname("Instrument" + i);  
            getInstrument().add(Iobj);  
        }  
    } 
    
    @Override
    public String toString() {  
        return "InstrumentShop [shopname=" + shopname + ", instrument=" + items + "]";  
    }

    @Override
    protected InstrumentShop clone() throws CloneNotSupportedException {  
        //code to achieve deep cloning instead of shallow cloning  
        InstrumentShop ishop = new InstrumentShop();  
        for (InstrumentItem Iobj: this.getInstrument()) {  
            ishop.getInstrument().add(Iobj);  
        }  
        return ishop;  
    }  
    
}
