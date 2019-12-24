public class SimpleDotcom_or_battleShipTestDrive {
    public static void main(String[] args){
        SimpleDotcom dot = new SimpleDotcom();
        int[] locations = {2, 3, 1};
        dot.setLocationCells(locations);
        String userGuess = "2";
        dot.checkyourSelf(userGuess);
        userGuess = "3";
        dot.checkyourSelf(userGuess);
        userGuess = "4";
        dot.checkyourSelf(userGuess);
        userGuess = "7";
        dot.checkyourSelf(userGuess);
        userGuess = "1";
        dot.checkyourSelf(userGuess);
        dot.hit();
    }
}
