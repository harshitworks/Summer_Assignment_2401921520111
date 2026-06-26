package Week_4.OOPS;

public class Main {
    static void main(String[] args) {
        Outer out = new Outer();
        out.display();

        Outer.Inner in = out.new Inner();
        in.display();
    }
}
