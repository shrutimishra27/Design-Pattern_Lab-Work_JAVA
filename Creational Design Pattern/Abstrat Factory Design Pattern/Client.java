import com.Abstract_MusicFactory.AbstractFactory;
import com.Abstract_MusicFactory.Chord;
import com.Abstract_MusicFactory.Key;
import com.Abstract_MusicFactory.Head;


//Set of factory class

public class Client {

    public static void main(String[] args) {

		//Get Keyboard Factory
		AbstractFactory keyFactory = FactoryProducer.getFactory("Key");

		// Get Keyboard class objects-:
		Key keytype1 = keyFactory.getKeyboardInstrument("Harmonium");
		keytype1.click_on();

		Key keytype2 = keyFactory.getKeyboardInstrument("Piano");
		keytype2.click_on();

		//----------------

		//Get String Factory //key chord head
		AbstractFactory stringFactory = FactoryProducer.getFactory("Chord");

		// Get String Factory class objects-:\
		Chord chordtype1 = stringFactory.getStringInstrument("Guitar");
		chordtype1.strum_on();

		Chord chordtype2 = stringFactory.getStringInstrument("Violin");
		chordtype2.strum_on();

		//----------------

		//Get String Factory //key chord head
		AbstractFactory percussionFactory = FactoryProducer.getFactory("Head");

		// Get String Factory class objects-:\
		Head headtype1 = percussionFactory.getPercussionInstrument("Drum");
		headtype1.bang_on();

		Head headtype2 = percussionFactory.getPercussionInstrument("Congo");
		headtype2.bang_on();

    }
}
