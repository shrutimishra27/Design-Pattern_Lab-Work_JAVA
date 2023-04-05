package adapterDP;

public class Bass_Instrument implements New_Instrument_Interface{

    public void playBass(String filename) {
		System.out.println("Selling NEW-Generation Bass " + filename);
	}

    public void playElectric(String filename) {
		//do nothing		
	}

}
