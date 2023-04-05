package adapterDP;

public class Client {
	public static void main(String args[]) {

		Instrument_Shop ishop = new Instrument_Shop();

		//Selling New instruments
		 ishop.play("Electric", "Guitar");
		 ishop.play("Bass", "Xylophone");

		 //Selling Old instruments
		 ishop.play("Acoustic", "Violin");


	}
}