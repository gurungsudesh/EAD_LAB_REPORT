public class SingleObject{
    //early initialization
    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }
    public static SingleObject getInstance(){

        return instance;

    }
    public void showMessage(){
        System.out.println("Single object created");
    }

}