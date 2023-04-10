package iteratorDP;
public class Client {

    public static void main(String[] args) {

        iContainer container = new MusicContainer();
        iIterator iterator = container.getIterator();
        while (iterator.hasnext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }
}
