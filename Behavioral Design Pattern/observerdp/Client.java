
public class Client {
    public static void main(String[] args) {
        InstrumentOrder instrumentOrder = new InstrumentOrder();

        new OrderConfirmed(instrumentOrder);
        new OrderDelivered(instrumentOrder);
        new OrderCancelled(instrumentOrder);


        instrumentOrder.setOrder(1);

    }
}