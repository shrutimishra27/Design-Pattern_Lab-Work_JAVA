package adapterDP;

public class Instrument_Shop implements Old_Instrument_Interface {

    InstrumentAdapter instrumentadapter;

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("Acoustic")) {
            System.out.println("Selling OLD-Generation Acoustic " + fileName);
        }

        // instrumentadapter is providing support to sell other type of instruments
        else if (audioType.equalsIgnoreCase("Electric") || audioType.equalsIgnoreCase("Bass")) {
            instrumentadapter = new InstrumentAdapter(audioType);
            instrumentadapter.play(audioType, fileName);
        }

        else {
            System.out.println("Invalid Instrument Type. " + audioType + " Product Not Available currently");
        }
    }

}
