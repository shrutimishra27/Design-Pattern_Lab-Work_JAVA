package statedp;

public class BuildingState implements InstrumentOrderState {

    @Override
    public void takeOrder(InstrumentOrder io) {
        System.out.println("Order for Instrument has already been taken");
    }

    @Override
    public void prepareInstrument(InstrumentOrder io) {
        io.setState(new BuiltState());
        System.out.println("Instrument is being built");
    }

    @Override
    public void deliveredOrder(InstrumentOrder io) {
        System.out.println("Instrument cannot be delivered until it is built");
    }
}
