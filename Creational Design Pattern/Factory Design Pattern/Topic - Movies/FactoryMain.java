//This is the main file
//When there are superclass and thier multiple subclasses
//My eg Movies Genre
public class FactoryMain{

    public static void main(String[] args) {

        MoviesFactory mf = new MoviesFactory();
        Movies m1 = mf.getInstance("asdf");
        m1.genre();
    }
}
