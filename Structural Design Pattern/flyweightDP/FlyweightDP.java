package flyweightDP;

public class FlyweightDP {
    private static final String choice[] = { "Mahogany", "Teak", "Maple" };
    public static void main(String[] args) {
 
       for(int i=0; i < 9; ++i) {
          Harmonium p = (Harmonium) HarmoniumFactory.getHarmonium(getRandomChoice());
          p.play();
       }
    }
    private static String getRandomChoice() {
       return choice[(int)(Math.random()*choice.length)];
    }
 }

