package adapterDP;

public class Electric_Instrument implements New_Instrument_Interface{

    public void playElectric(String filename) {
		System.out.println("Selling NEW-Generation Electric " + filename);
	}


	public void playBass(String fileName) {
	   //do nothing
	}
}

