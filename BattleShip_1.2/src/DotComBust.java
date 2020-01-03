import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<SimpleDotcom> DotcomList = new ArrayList<SimpleDotcom>();
    private int numberOfGuess = 0;

    private void setUpGame(){
        SimpleDotcom one = new SimpleDotcom();
        one.setName("pets.com");
        SimpleDotcom two = new SimpleDotcom();
        two.setName("toy.com");
        SimpleDotcom three = new SimpleDotcom();
        three.setName("go2.com");
        DotcomList.add(one);
        DotcomList.add(two);
        DotcomList.add(three);
        System.out.println("Your goal is to srink three dot com");
        System.out.println("pets.com toy.com go2.com");
        System.out.println("try to shrink them all in the few number of guess");
        for(SimpleDotcom dotcomtoSet : DotcomList){
            String newlocation = helper.getUserinput("3");
        }
    }
}
