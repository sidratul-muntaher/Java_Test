import java.util.ArrayList;

class SimpleDotcom{
    private ArrayList<String> locationCells ;
    int numberOfHit = 0;
    private String name;
    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public void setName(String n){
        name = n;
    }

    public String checkyourSelf(String stringGuess){
        String result = "miss";
        int index = locationCells.indexOf(stringGuess);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "Kill";
                System.out.println("Ouch ! You sunk " + name );
            }else{
                result = "Hit";
            }
        }
        System.out.println(result);
        return result;
    }

}