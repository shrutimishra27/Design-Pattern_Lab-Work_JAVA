
public class OrderCancelled extends Observer{
    public OrderCancelled(InstrumentOrder instrumentOrder) {
        this.instrumentOrder = instrumentOrder;
        this.instrumentOrder.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Instrument Order Cancel");
    }
}
