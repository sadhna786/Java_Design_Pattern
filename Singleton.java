 public class Singleton{
    
    private static Singleton singleton;
    private Singleton(){

    }

    //lazy way of creating singleton object
    public static Singleton getSingleton(){
        //object of this class

        if(singleton == null){

            singleton = new Singleton();
        }
        return singleton;
    }

}