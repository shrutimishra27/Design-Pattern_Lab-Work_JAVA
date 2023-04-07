public class InstrumentFacade {
    Guitar guitar;
    Drum drum;

    public InstrumentFacade(Guitar guitar1 , Drum drum1){
        this.guitar = guitar1;
        this.drum = drum1;
    }

    public void acousticInstruments(){
        guitar.AcousticGuitar();
        drum.AcousticDrum();
    }

    public void electricInstrument(){
        guitar.ElectricGuitar();
        drum.ElectricDrum();
    }

}