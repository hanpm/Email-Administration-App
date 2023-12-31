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
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Write methods for our requirements
    // Constructor to receive the firstName and lastName
    public Email(String firstName, String lastName) {
        // this keyword refers to the class level variable
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email is created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.print(this.department);
    }
    // Call a method that is asking for the department
    // Ask for department
    private String setDepartment() {
        System.out.println("Enter the department\n1) Sales\n2) Development\n3) Accounting\n0) None");

        // Input in Java
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";

        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "None";
        }
    }

    // Generate random password

    // Set mailbox capacity

    // Set alternate email

    // Change passwords

}
