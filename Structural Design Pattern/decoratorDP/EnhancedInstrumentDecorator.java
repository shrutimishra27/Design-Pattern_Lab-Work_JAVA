package decoratorDP;

public class EnhancedInstrumentDecorator extends InstrumentDecorator {

   public EnhancedInstrumentDecorator(Instrument decoratedInstrument) {
      super(decoratedInstrument);
   }

   @Override
   public void play() {
      decoratedInstrument.play();
      setElectricBoard(decoratedInstrument);
   }

   private void setElectricBoard(Instrument decoratedInstrument){
      System.out.println("Enhance Feature: Electric");
   }
}