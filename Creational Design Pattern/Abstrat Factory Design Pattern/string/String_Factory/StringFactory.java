package string.String_Factory;

import com.Abstract_MusicFactory.AbstractFactory;
import com.Abstract_MusicFactory.Chord;
import com.Abstract_MusicFactory.Head;
import com.Abstract_MusicFactory.Key;

public class StringFactory extends AbstractFactory{
    
    public Chord getStringInstrument(String chordType){
        if(chordType == null){
            return null;
         }		
         if(chordType.equalsIgnoreCase("Guitar")){
            return new Guitar();
    
         } else if(chordType.equalsIgnoreCase("Violin")){
            return new Violin();
    
         }
    
         return null;
    }

    public Key getKeyboardInstrument(String keyType){
        return null;
    }

    public Head getPercussionInstrument(String headType){
        return null;
    }
}
