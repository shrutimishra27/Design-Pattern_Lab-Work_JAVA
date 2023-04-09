package flyweightDP;

public class Harmonium implements Instrument {
    private String wood;

 
    public Harmonium(String wood){
       this.wood = wood;
    }
 
    @Override
    public void play() {
       System.out.println(wood + "-wood Harmonium");
    }
}

