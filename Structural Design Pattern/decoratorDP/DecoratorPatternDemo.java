package decoratorDP;

public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Instrument guitar = new Guitar();

      Instrument electricGuitar = new EnhancedInstrumentDecorator(new Guitar());

      Instrument electricDrum = new EnhancedInstrumentDecorator(new Drum());
      System.out.println("Acoustic Guitar : Basic Version");
      guitar.play();

      System.out.println("\nElectric Guitar : Enhanced Version");
      electricGuitar.play();

      System.out.println("\nElectric Drum : Enhanced Version");
      electricDrum.play();
   }
}