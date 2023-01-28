package designpattern.Singlrtondesignpattern;

public class SingleObjectDoubleCheckLocking {
    //create an object of SingleObject
    private static SingleObjectDoubleCheckLocking instance = new SingleObjectDoubleCheckLocking();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObjectDoubleCheckLocking(){}

    //Get the only object available
    public static SingleObjectDoubleCheckLocking getInstance(){
        if (instance == null){
            synchronized(SingleObjectDoubleCheckLocking.class){
                if (instance == null){
                    instance = new SingleObjectDoubleCheckLocking();//instance will be created at request time
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
