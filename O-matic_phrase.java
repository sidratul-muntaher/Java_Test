public class phraseOmatic{
    public static void main(String[] arg){
        String wordListOne[] = {"a breeze", "a dime a dozen", "a field day", "a hell of a time", "lot on my plate", "about time", "ace in the hole", "all ears", "all ears"};
        String wordListTwo[] = {"basket case", "be an item", "be nuts about", "beet red", "big cheese", "birthday suit", "naked"};
        String wordListThree[] = {"crunch tim", "cry over spilled milk", "cry your heart out", "cry a lot", "fake tears", "crocodile tears"};

        int oneLeng = wordListOne.length;
        int twoLeng = wordListTwo.length;
        int threeLeng = wordListThree.length;

        int randone = (int) (Math.random() * oneLeng);
        int randTwo = (int) (Math.random() * twoLeng);
        int randThree = (int) (Math.random() * threeLeng);

        String phrase = wordListOne[randone] + " " + wordListTwo[randTwo] + " " + wordListThree[threeLeng];
        System.out.println("What we need is a " + phrase);

    }
}