
public class OrderDelivered extends Observer{
    public OrderDelivered(InstrumentOrder instrumentOrder) {
        this.instrumentOrder = instrumentOrder;
        this.instrumentOrder.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Instrument Order deliver");
    }
}
