//This class is used to get instance of all types of music instrument in the main file

public class MusicFactory {

    public Music getInstance(String str){

        if(str.equals("type1")){ 
            return new Guitar();
        }
        else if(str.equals("type2")){
            return new Piano();
        }   
        else
        return new Drum();
    }
}
