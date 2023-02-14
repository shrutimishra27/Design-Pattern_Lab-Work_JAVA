package percussion.Percussion_Factory;


import com.Abstract_MusicFactory.AbstractFactory;
import com.Abstract_MusicFactory.Chord;
import com.Abstract_MusicFactory.Head;
import com.Abstract_MusicFactory.Key;

public class PercussionFactory extends AbstractFactory{
    public Head getPercussionInstrument(String headType){
        if(headType == null){
            return null;
         }		
         if(headType.equalsIgnoreCase("Drum")){
            return new Drum();
    
         } else if(headType.equalsIgnoreCase("Congo")){
            return new Congo();
    
         }
    
         return null;
    }

    public Chord getStringInstrument(String chordType){
        return null;
    }

    public Key getKeyboardInstrument(String keyType){
        return null;
    }
}
