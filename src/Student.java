import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {

    private List<Observer> parents = new ArrayList<Observer>();

    private boolean inClass;

    public boolean isInClass() {
        return inClass;
    }

    public void setInClass(boolean inClass) {
        this.inClass = inClass;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        parents.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        parents.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer parent: parents){
            parent.update(this.isInClass());
        }
    }
}
