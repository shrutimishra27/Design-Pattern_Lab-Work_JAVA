//This is the main file
//When there are superclass and thier multiple subclasses
public class FactoryMain{

    public static void main(String[] args) {

        MusicFactory mf = new MusicFactory();
        Music m1 = mf.getInstance("asdf");
        m1.genre();
    }
}
