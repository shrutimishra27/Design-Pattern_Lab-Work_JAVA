package statedp;

//CONTEXT CLASS

public class InstrumentOrder {
    private InstrumentOrderState state;

    public InstrumentOrder() {
        state = new OrderingState();
    }

    public void setState(InstrumentOrderState state) {
        this.state = state;
    }

    public void takeOrder() {
        state.takeOrder(this);
    }

    public void prepareInstrument() {
        state.prepareInstrument(this);
    }

    public void deliveredOrder() {
        state.deliveredOrder(this);
    }
}
