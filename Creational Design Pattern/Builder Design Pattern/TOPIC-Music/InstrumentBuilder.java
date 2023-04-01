//interact with user
public class InstrumentBuilder{
    private String Type;
    private String Feature;
    private int Warranty;
    private int Quantity;

    public InstrumentBuilder setType(String Type){
        this.Type = Type;
        return this;
    }

    public InstrumentBuilder setFeature(String Feature){
        this.Feature = Feature;
        return this;
    }

    public InstrumentBuilder setWarranty(int Warranty){
        this.Warranty = Warranty;
        return this;
    }

    public InstrumentBuilder setQuantity(int Quantity){
        this.Quantity = Quantity;
        return this;
    }

    public Instrument getInstrument(){
        return new Instrument(Type , Feature ,Warranty, Quantity);
    }
}
