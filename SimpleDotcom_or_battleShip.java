class SimpleDotcom{
    int[] locationCells;
    int numberOfHit;
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkyourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell : locationCells){
            if(guess == cell){
                result = "hit";
                numberOfHit ++;
                break;
            }
        }
        if(numberOfHit == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}