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
        //it will not run if we not initial value to local variable
        /* int x ;
        System.out.println(x); */
        /* Local variables do
        NOT get a default
        value! The compiler
        complains if you
        try to use a local
        variable before
        the variable is
        initialized. */

        /* Instance variables
        always get a
        default value. If
        you don't explicitly
        assign a value
        to an instance
        variable, or you
        don't call a setter
        method, the
        instance variab'e
        still has a value!
        integers 0
        floating points 0.0
        booleans false */
    }
}