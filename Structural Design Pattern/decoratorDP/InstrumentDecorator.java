package decoratorDP;

public abstract class InstrumentDecorator implements Instrument {
   protected Instrument decoratedInstrument;

   public InstrumentDecorator(Instrument decoratedShape){
      this.decoratedInstrument = decoratedShape;
   }

   public void play(){
      decoratedInstrument.play();
   }	
}

