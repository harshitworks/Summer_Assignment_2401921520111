package Week_1.OOPS;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // TestCase 1:
        KidUser kid1 = new KidUser(10);
        kid1.registerAccount();
        kid1.bookType= "Kids";
        kid1.requestBook();


        kid1.age=18 ;
        kid1.registerAccount();
        kid1.bookType= "Fiction";
        kid1.requestBook();


        // TestCase 2:
        AdultUser adl = new AdultUser(5);
        adl.registerAccount();
        adl.bookType= "Kids";
        adl.requestBook();

        adl.age=23;
        adl.registerAccount();
        adl.bookType= "Fiction";
        adl.requestBook();
    }
}
