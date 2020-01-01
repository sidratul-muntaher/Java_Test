import java.util.ArrayList;

class SimpleDotcom_or_battleShipTestDrive {

    public static void main(String[] args){
        int numberofGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotcom dot = new SimpleDotcom();
        int randomNumber = (int) (Math.random() * 5);
        ArrayList<String> locations;
        locations = {randomNumber, randomNumber + 1, randomNumber + 2};
        dot.setLocationCells(locations);
        boolean isAlive = true;
        while(isAlive == true){
            String guess = helper.getUserinput("Inter a Number : ");
            String resuly = dot.checkyourSelf(guess);
            numberofGuess ++;
            if(resuly.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numberofGuess + " guess");
            }
        }


    }
}