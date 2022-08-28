import java.util.ArrayList;

/**
 * Represents a library member, 
 * i.e. a typical user of a library (e.g. student, academic) 
 * that can borrow/return books 
 * and/or access electronic resources.
 *
 * @author Joshua Reid
 * @version 02/12/2021
 */

public class LibraryMember
{
    private String studentName;
    private String studentNumber;
    private String department;
    private String course;
    private String notifications;
    private boolean borrowing;
    private ArrayList<LibraryResource> borrowed;

    /**
     * Constructor for objects of class PhysicalBook.
     * Insert the student name, student number, department and course
     * they are attending.
     */
    public LibraryMember(String studentName, String studentNumber, String department, String course)
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.department = department;
        this.course = course;
        notifications = "";
        borrowing = false;
        borrowed = new ArrayList<>();
    }
    
    /**
     * Constructor for objects of class PhysicalBook.
     * Basic constructor with no parameters.
     */
    public LibraryMember()
    {
        studentName = "";
        studentNumber = "";
        department = "";
        course = "";
        notifications = "";
        borrowing = false;
        borrowed = new ArrayList<>();
    }
    
    /**
     * Returns the full name of the library member.
     * 
     * @return  The full name of the library member.
     */
    public String getStudentName()
    {
        return studentName;
    }
    
    /**
     * Returns the student number of the library member.
     * 
     * @return  The student number of the library member.
     */
    public String getStudentId()
    {
        return studentNumber;
    }
    
    /**
     * Returns the department the library member is a part of.
     * 
     * @return  The department of the library member.
     */
    public String getDepartment()
    {
        return department;
    }
    
    /**
     * Returns the course of the library member is attending.
     * 
     * @return  The course of the library member.
     */
    public String getCourse()
    {
        return course;
    }
    
    /**
     * Returns notifications of the library member.
     * 
     * @return  The notifications for the library member.
     */
    public String getNotifications()
    {
        return notifications;
    }
    
    /**
     * Returns true if the library member is currently borrowing books,
     * false if they are not.
     * 
     * @return      True if borrowing, false if not.
     */
    public boolean getBorrowing()
    {
        return borrowing;
    }
    
    /**
     * Return the list of borrowed books.
     * @return      The list of borrowed books.
     */
    public ArrayList<LibraryResource> getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Sets name of the library member.
     * 
     * @param studentName       Insert the name of the library member
     */
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    /**
     * Sets student ID of the library member.
     * 
     * @param studentNumber     Insert the student ID of the library member.
     */
    public void setStudentId(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    
    /**
     * Sets department of the library member.
     * 
     * @param department     Insert the department of the library member.
     */
    public void setDepartment(String department)
    {
        this.department = department;
    }
    
    /**
     * Sets the course of the library member.
     * 
     * @param course     Insert the course of the library member.
     */
    public void setCourse(String course)
    {
        this.course = course;
    }
    
    /**
     * Set true if the library member is borrowing a book,
     * false if they are not.
     * 
     * @param borrowing     True if borrowing a book, false if not.
     */
    public void setBorrowing(boolean borrowing)
    {
        this.borrowing = borrowing;
    }
    
    /**
     * Updates notifications to the library member.
     * 
     * @param addNotification  Add new notifications to the library member.
     */
    public void sendNotifications(String addNotification)
    {
        notifications += "\n" + addNotification + "." + "\n";
    }
    
    /**
     * Checks if the library member is currently holding book/s,
     * 
     */
    public void checkHoldingBook()
    {
        if (getBorrowed().isEmpty()) {
            setBorrowing(false);
            System.out.println("Error: " + studentName + " is not borrowing books.");
        }
        else {
            setBorrowing(true);
        }
    }
    
    /**
     * Print details of the library members name, ID, department, course,
     * and if they are borrowing any books currently or not.
     * 
     */
    public void printLibraryMemberDetails()
    {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentNumber);
        System.out.println("Department: " + department);
        System.out.println("Course: " + course);
        if (getBorrowing() == true) {
            System.out.println(studentName + " is currently holding " + borrowed.size() + " books.");
        }
        else {
            System.out.println(studentName + " is not holding any books.");
        }
    }
    
    /**
     * Print all notifications recieved to the library member.
     * 
     */
    public void printAllMessagesRecieved()
    {
        System.out.println("Messages:" + notifications);
    }
    
    /**
     * Borrow a book from the library, cannot hold more than 5 books at a time.
     * 
     * @param book      A book to be added to the library members collection.
     */
    public void addBook(LibraryResource book)
    {
        if (borrowed.size() < 5) {
            borrowed.add(book);
            setBorrowing(true);
        }
        else {
            System.out.println("Error: Cannot loan more than 5 books, please return a book.");
        }
    }
    
    /**
     * Prints details of the books borrowed by the library member.
     * 
     */
    public void printBooksBorrowedDetails()
    {
        if (borrowed.isEmpty()) {
            System.out.println("Error: No books have been borrowed!");
        }
        else {
            for(LibraryResource borrowedDetails : borrowed) {
                borrowedDetails.display();
                System.out.println();   // empty line between posts
            }
        }
    }
    
    /**
     * Returns how many books have been borrowed by the library member.
     * 
     */
    public int getNoOfBooksBorrowed()
    {
        return borrowed.size();
    }
}
