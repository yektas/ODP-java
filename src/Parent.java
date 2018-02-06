

public class Parent implements Observer {

    @Override
    public void update(boolean inClass) {
        if (inClass){
            System.out.println("Your child is in class");
        }
        else {
            System.out.println("Your child is not in the class");
        }

    }
}
