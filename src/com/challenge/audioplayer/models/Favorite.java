/**
 * Favorite
 */
public class Favorite {

    public void addFavorite(Audio audio){
        if(audio.getCalification()>=8){
            System.out.println(audio.getTitle() + "Favoritos del momento");
        }else{
            System.out.println(audio.getTitle() + "no tan favoritos");
        }
    }
}