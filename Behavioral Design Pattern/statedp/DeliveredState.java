package statedp;

public class DeliveredState implements InstrumentOrderState {
    @Override
    public void takeOrder(InstrumentOrder io) {
        System.out.println("Order for Instrument has already been taken");
    }

    @Override
    public void prepareInstrument(InstrumentOrder io) {
        System.out.println("Instrument has already been built");
    }

    @Override
    public void deliveredOrder(InstrumentOrder io) {
        System.out.println("Instrument has already been delivered");
    }
}
