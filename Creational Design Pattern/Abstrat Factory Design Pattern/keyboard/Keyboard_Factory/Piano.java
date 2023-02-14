package keyboard.Keyboard_Factory;

import com.Abstract_MusicFactory.Key;

public class Piano implements Key {

    @Override
    public void click_on() {
        System.out.println("Keyboard-Factory Instrument --> Piano.");
    }
    
}
