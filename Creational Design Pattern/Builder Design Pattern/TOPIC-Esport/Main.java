package builder;

//Topic : Esports
//Creating an E-sport Builder that will provide 2 games along with their combined/single price
/*Feature:
2 games specified by the seller
Price of the combination/single game
*/

//Main File
public class Main {
    public static void main(String[] args) {
        //1 Game name specified and not the other game name
        //The price is specified
        eSport es = new eSport_builder().setName1("Fortnite").setPrice(500).getEsport();
        System.out.println(es);
    }
}
