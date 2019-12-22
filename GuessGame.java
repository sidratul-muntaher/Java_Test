import javax.swing.text.StyledEditorKit.BoldAction;

class GuessGame{
    player p1 = new player();
    player p2 = new player();
    player p3 = new player();
    public void StartGame()
    {
        int guess_p1 = 0;
        int guess_p2 = 0;
        int guess_p3 = 0;

        boolean p1_isright = false;
        boolean p2_isright = false;
        boolean p3_isright = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 - 10 ");

        while(true)
        {
            System.out.println("Number to Guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guess_p1 = p1.number;
            System.out.println("Player one Guessed : " + guess_p1);
            guess_p2 = p2.number;
            System.out.println("Player two Guessed : " + guess_p2);
            guess_p3 = p3.number;
            System.out.println("Player three Guessed : " + guess_p3);

            if(guess_p1 == targetNumber){
                p1_isright = true;
            }
            if(guess_p2 == targetNumber){
                p2_isright = true;
            }
            if(guess_p3 == targetNumber){
                p3_isright = true;
            }
            if(p1_isright || p2_isright || p3_isright){
                System.out.println("We have a winner");
                System.out.println("Player one got it right ? " + p1_isright);
                System.out.println("Player two got it right ? " + p2_isright);
                System.out.println("Player three got it right ? " + p3_isright);
                System.out.println("Game Over");
                break;
            }
            else{
                System.out.println("We have to try again");
            }
            
        }
    }
}