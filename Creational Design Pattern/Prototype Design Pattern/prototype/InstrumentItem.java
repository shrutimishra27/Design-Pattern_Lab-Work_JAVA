package prototype;

public class InstrumentItem {
    private int Iid;  
    private String Iname; 

    //for Instrument-ID
    public int getIid() {  
        return Iid;  
    }  

    public void setIid(int Iid) {  
        this.Iid = Iid;  
    }  

    //for Instrument-Name
    public String getIname() {  
        return Iname;  
    }  

    public void setIname(String iname) {  
        Iname = iname;  
    }  
 
    @Override
    public String toString() {  
        return "Instrument [Iid=" + Iid + ", Iname=" + Iname + "]";
    }
}

