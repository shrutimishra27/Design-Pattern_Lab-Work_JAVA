public class Client {
    public static void main(String[] args) {

        Guitar obj1 = new Guitar();
        Drum obj2 = new Drum();

        InstrumentFacade facade = new InstrumentFacade(obj1,obj2);

        facade.electricInstrument();

        System.out.println();
        System.out.println();

        facade.acousticInstruments();

    }

}