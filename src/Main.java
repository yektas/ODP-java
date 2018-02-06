public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        Parent father = new Parent();
        Parent mother = new Parent();

        student.addObserver(father);
        student.addObserver(mother);

        student.setInClass(false);
        student.notifyObserver();

        student.removeObserver(father);

    }
}
