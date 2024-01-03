package emailApp;

// This is our main application
public class EmailApp {
    public static void main(String[] args) {
        // Create an object
        Email email1 = new Email("Han", "Pham");

        email1.setAlternativeEmail("altEmail@gmail.com");
        email1.setMailboxCapacity(100);
        email1.changePassword("123nnkenkg#$");

        System.out.print(email1.showInfo());

    }
}
