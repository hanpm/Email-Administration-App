package emailApp;

// This is our main application
public class EmailApp {
    public static void main(String[] args) {
        // Create an object
        Email email1 = new Email("Han", "Pham");

        email1.setAlternativeEmail("altEmail@gmail.com");
//        System.out.print("Your alternate email: " + email1.getAlternateEmail());

        email1.setMailboxCapacity(100);
//        System.out.println("\nMailbox capacity: " + email1.getMailboxCapacity());

//        System.out.println("Old password: " + email1.getPassword());
        email1.changePassword("123nnkenkg#$");
//        System.out.println("New password: " + email1.getPassword());

        System.out.print(email1.showInfo());

    }
}
