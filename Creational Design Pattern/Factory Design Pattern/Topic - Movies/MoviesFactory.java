//This class is used to get instance of all types of movies in the main file

public class MoviesFactory {

    public Movies getInstance(String str){

        if(str.equals("type1")){ 
            return new Thriller();
        }
        else if(str.equals("type2")){
            return new Comedy();
        }   
        else if(str.equals("type3")){
            return new Drama();
        }   
        else
        return new Suspense();
    }
}
