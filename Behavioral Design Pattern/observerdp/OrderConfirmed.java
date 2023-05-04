
public class OrderConfirmed extends Observer{
    public OrderConfirmed(InstrumentOrder instrumentOrder) {
        this.instrumentOrder = instrumentOrder;
        this.instrumentOrder.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Instrument Order confirm");
    }
}
