package emailApp;
import java.util.Objects;
import java.util.Scanner;


// This is where we make our email objects
public class Email {
    /*
    1) Create variables to store required information
    2) Private keyword to ENCAPSULATE this sensitive information
    3) Use public methods (get/set) to update and modify the values of these private variables
    */
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 600;
    private String alternateEmail;

    private String companySuffix = "anycompany.com";

    // Write methods for our requirements
    // Constructor to receive the firstName, lastName, department, default password
    public Email(String firstName, String lastName) {
        // this keyword refers to the class level variable
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Creating email for: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();



        this.password = setPassword(defaultPasswordLength);
        System.out.println("Your default password: "+ this.password);

        // == checks for whether they are the same object
        // .equals() checks for whether they contain the same data
        if (!Objects.equals(department, "")) {
            email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" + department + "."+ companySuffix;
        }
        else {
            email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" + companySuffix;
        }



    }

    /*
    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
    To achieve this, you must:
    - declare class variables/attributes as private
    - provide public get and set methods to access and update the value of a private variable
     */

    // SET METHODS
    //These are the methods used in OOPS feature which helps
    // to set the value to private attributes in a class.

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
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternativeEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Set the new password
    public void changePassword(String password) {
        this.password = setPassword(defaultPasswordLength);
    }

    // GET METHODS
    // These are the methods used in Object-Oriented Programming (OOPS)
    // which helps to access the private attributes from a class.
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    // Show the name, email, mailbox capacity
    public String showInfo() {
        return "\n====== SHOW INFO ======\n" + "Display Name: " + firstName + " " + lastName + "\n" +
                "Company email: " + email + "\n" +
                "Mailbox Capacity: " + mailboxCapacity +"mb";
    }

}
