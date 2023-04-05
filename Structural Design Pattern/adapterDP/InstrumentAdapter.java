package adapterDP;

public class InstrumentAdapter implements Old_Instrument_Interface {
  New_Instrument_Interface new_instrument_interface;

  public InstrumentAdapter(String audioType) {
    if (audioType.equalsIgnoreCase("Bass")) {
      new_instrument_interface = new Bass_Instrument();

    } else if (audioType.equalsIgnoreCase("Electric")) {
      new_instrument_interface = new Electric_Instrument();
    }
  }

  @Override
  public void play(String audioType, String fileName) {

    if (audioType.equalsIgnoreCase("Electric")) {
      new_instrument_interface.playElectric(fileName);
    } else if (audioType.equalsIgnoreCase("Bass")) {
      new_instrument_interface.playBass(fileName);
    }

  }

}
