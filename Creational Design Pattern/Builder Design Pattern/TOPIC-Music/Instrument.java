
public class Instrument {
    private String Type;
    private String Feature;
    private int Warranty;
    private int Quantity;

    public Instrument(String Type , String Feature , int Warranty , int Quantity){

        super();
        this.Type  = Type;
        this.Feature = Feature;
        this.Warranty = Warranty;
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Instrument[Type="+ Type + ",Feature="+ Feature + ", Warranty="+ Warranty + ", Quantity="+ Quantity + "]";
    }
}
