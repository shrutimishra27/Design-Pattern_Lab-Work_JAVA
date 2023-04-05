//Single instance exist

//Eager instance creation
class MusicEager {
    static MusicEager obj = new MusicEager();
    private MusicEager(){
        System.out.println("Eager Instance");
    }

    public static MusicEager getInstance(){
        return obj;
    }
}

//Lazy instance creation
class MusicLazy{
    public static MusicLazy obj;
    private MusicLazy(){
        System.out.println("Lazy instance");
    }
    public static MusicLazy getInstance(){
        if (obj == null){
            obj = new MusicLazy();
        }
        return obj;
    }
}


public class SingletonExample {
    public static void main(String[] args) {

        //Eager
        MusicEager obj1 = MusicEager.getInstance();
        MusicEager obj2 = MusicEager.getInstance();

        //Lazy
        MusicLazy obj3 = MusicLazy.getInstance();
        MusicLazy obj4 = MusicLazy.getInstance();

    }
}
