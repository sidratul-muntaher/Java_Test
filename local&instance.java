class poorDog{
    private int size ;
    private String name;
    
    public int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
}
 class poorDogTestDrive{
    public static void main(String[] arg){
        poorDog one = new poorDog();
        System.out.println("Size : " + one.getSize());
        System.out.println("Name : " + one.getName());
    }
}