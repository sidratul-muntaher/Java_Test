public class GoodDogTestDrive {

    public static void main(String[] arg){
        goodDog one  = new goodDog();
        one.setSize(70);
        goodDog two = new goodDog();
        two.setSize(8);
        System.out.println("Dog one : " + one.getSize());
        System.out.println("Dog Two : " + two.getSize());
        one.bark();
        two.bark();
    }
}