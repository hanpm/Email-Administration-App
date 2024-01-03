package emailApp;
import java.util.Scanner;


// This is where we make our email objects
public class Email {
    /*
    1) Create variables to store required information
    2) Private keyword to ENCAPSULATE this sensitive information
    */
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 600;
    private String alternateEmail;

    private String companySuffix = ".anycompany.com";

    // Write methods for our requirements
    // Constructor to receive the firstName, lastName, department, default password
    public Email(String firstName, String lastName) {
        // this keyword refers to the class level variable
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Creating email for: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
//        System.out.println("Department: " + this.department);


        this.password = setPassword(defaultPasswordLength);
        System.out.println("Your default password: "+ this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" + department + companySuffix;

        System.out.println("Your email: "+ email);


    }

    // Set a random password method
    private String setPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$%&!";
        char[] password = new char[length];

        for (int i=0; i<length; i++){
            // Make random number in range of length passwordSet
            int rand = (int) (Math.random() * passwordSet.length());
            // Insert that random number
            password[i] = passwordSet.charAt(rand);



        }
        // return a string of the password
        return new String(password);
    }

    // Set the department
    // Ask for department
    private String setDepartment() {
        System.out.println("Enter the department code:\n1) Sales\n2) Development\n3) Accounting\n0) None");

        // Input in Java
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "dev";

        } else if (departmentChoice == 3) {
            return "acc";
        } else {
            return "";
        }
    }

    // Set mailbox capacity
    // This is encapsulation, where we are making it public to set some properties
    // However, we are hiding the actual properties
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternativeEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Set the new password
    public void changePassword(String password) {
        this.password = password;
    }

    // GET METHODS
    // Instead of accessing the properties directly,
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

}
