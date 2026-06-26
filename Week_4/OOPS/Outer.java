package Week_4.OOPS;

public class Outer {
    public void display() {
        System.out.println("here we are in outer the class");
    }
    class Inner {
        public void display() {
            System.out.println("this is inner class");
        }
    }
}
