package flyweightDP;
import java.util.HashMap;

public class HarmoniumFactory {

   private static final HashMap hm = new HashMap();

   public static Instrument getHarmonium(String wood) {
      Harmonium p = (Harmonium)hm.get(wood);
 
      if(p == null) {
         p = new Harmonium(wood);
          hm.put(wood, p);
         System.out.println("Creating Harmonium of wood type :  " + wood);
       }
      return p;
   }
}
