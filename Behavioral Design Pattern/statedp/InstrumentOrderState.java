package statedp;

//STATE INTERFACE

public interface InstrumentOrderState {
    void takeOrder(InstrumentOrder io);

    void prepareInstrument(InstrumentOrder io);

    void deliveredOrder(InstrumentOrder io);
}
