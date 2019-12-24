class SimpleDotcom_or_battleShipTestDrive {

    public static void main(String[] args){
        SimpleDotcom dot = new SimpleDotcom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        dot.checkyourSelf(userGuess);
    }
}