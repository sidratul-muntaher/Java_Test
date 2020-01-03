public class Beersong{
    public static void main(String[] arg)
    {
        int beerNumber = 99;
        String word = "bottles";
        while(beerNumber > 0){
            if (beerNumber == 1){
                System.out.println("Bottle");
            }
            System.out.println(beerNumber + " " + word + " on the wall");
            System.out.println(beerNumber + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNumber = beerNumber - 1;
            if(beerNumber > 0){
            System.out.println(beerNumber + " " + word + " on the wall");
            }
            else{
                System.out.println("No more bottles beer on the wall");
            }
        }
    }
}