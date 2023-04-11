package statedp;

public class OrderingState implements InstrumentOrderState {

    @Override
    public void takeOrder(InstrumentOrder io) {
        io.setState(new BuildingState());
        System.out.println("Order for Instrument taken");
    }

    @Override
    public void prepareInstrument(InstrumentOrder io) {
        System.out.println("Instrument can not be built until it is taken");
    }

    @Override
    public void deliveredOrder(InstrumentOrder io) {
        System.out.println("Instrument can not be delivered until it is built");
    }
}
