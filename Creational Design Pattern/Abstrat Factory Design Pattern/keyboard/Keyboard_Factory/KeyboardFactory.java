package keyboard.Keyboard_Factory;

import com.Abstract_MusicFactory.AbstractFactory;
import com.Abstract_MusicFactory.Chord;
import com.Abstract_MusicFactory.Head;
import com.Abstract_MusicFactory.Key;

public class KeyboardFactory extends AbstractFactory{

    public Key getKeyboardInstrument(String keyType){
        if(keyType == null){
            return null;
         }		
         if(keyType.equalsIgnoreCase("Harmonium")){
            return new Harmonium();
    
         } else if(keyType.equalsIgnoreCase("Piano")){
            return new Piano();
    
         }
    
         return null;
    }

    public Chord getStringInstrument(String chordType){
        return null;
    }

    public Head getPercussionInstrument(String headType){
        return null;
    }

}
 