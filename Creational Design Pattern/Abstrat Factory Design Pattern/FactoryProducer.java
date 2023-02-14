
import com.Abstract_MusicFactory.AbstractFactory;

import keyboard.Keyboard_Factory.KeyboardFactory;
import percussion.Percussion_Factory.PercussionFactory;
import string.String_Factory.StringFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("Key")){
            return new KeyboardFactory();
    
         }else if(choice.equalsIgnoreCase("Chord")){
            return new StringFactory();
         }
         else if(choice.equalsIgnoreCase("Head")){
            return new PercussionFactory();
         }
    
         return null;
    }
}
