public class SimpleDotcom {
    int[] locationCells ;
    int numberOfHit = 0;
    int miss = 0;
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkyourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int i = 0; i<locationCells.length; i++){
            if(guess == locationCells[i]){
                result = "hit";
                numberOfHit ++;
                break;
            }
        }

        if(numberOfHit == locationCells.length){
            result = "kill";
        }
        for(int i = 0; i<locationCells.length; i++){
            if(guess != locationCells[i]){
                miss ++;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
    void hit()
    {
        System.out.println("You took " + (miss )+ " Guesses");
    }
}
