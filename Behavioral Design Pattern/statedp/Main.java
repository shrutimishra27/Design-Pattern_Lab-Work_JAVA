package statedp;

public class Main {
    public static void main(String[] args) {
        InstrumentOrder order = new InstrumentOrder();

        order.takeOrder();
        order.prepareInstrument();
        order.deliveredOrder();

        // Attempt to transition from an invalid state
        System.out.println();
        order.deliveredOrder();
    }
}
