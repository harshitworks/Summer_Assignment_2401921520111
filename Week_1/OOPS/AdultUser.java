package Week_1.OOPS;

public class AdultUser implements LibraryUser {
     int age;
     String bookType;
     public AdultUser() {
         System.out.println("Please enter your age");
     }

    public AdultUser(String bookType, int age) {
        this.bookType = bookType;
        this.age = age;
    }

    public AdultUser(String bookType) {
        this.bookType = bookType;
    }

    public AdultUser(int age) {
        this.age = age;
    }

    @Override
    public void registerAccount() {
        if(age>12) {
            System.out.println("You have successfully registered under an Adult Account");
        }
        else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }

    }

    @Override
    public void requestBook() {
        if(bookType.equals("Fiction")) {
            System.out.println("“Book Issued successfully, please return the book within 7 days” ");
        }
        else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }

    }
}
