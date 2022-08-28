

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryMemberTest.
 * All setters/getters and methods are tested.
 * All methods are tested for functioning together.
 *
 * @author  Joshua Reid
 * @version 02/12/2021
 */
public class LibraryMemberTest
{
    private LibraryMember libraryM1;
    private LibraryMember libraryM2;
    private LibraryMember libraryM3;

    /**
     * Default constructor for test class LibraryMemberTest
     */
    public LibraryMemberTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        libraryM1 = new LibraryMember("Bob", "458439865", "CIS", "Software Development");
        libraryM2 = new LibraryMember("Alice", "287543904", "CIS", "Software Development");
        libraryM3 = new LibraryMember("Oscar", "854398752", "CIS", "Software Development");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Tests the setter and getter for studentName field.
     */
    @Test
    public void testStudentName()
    {
        libraryM3.setStudentName("Oscar");
        assertEquals("Oscar", libraryM3.getStudentName());
    }

    /**
     * Tests the setter and getter for studentNumber field.
     */
    @Test
    public void testStudentId()
    {
        libraryM3.setStudentId("853975027");
        assertEquals("853975027", libraryM3.getStudentId());
    }

    /**
     * Tests the setter and getter for department field.
     */
    @Test
    public void testDepartment()
    {
        libraryM3.setDepartment("CIS");
        assertEquals("CIS", libraryM3.getDepartment());
    }

    /**
     * Tests the setter and getter for course field.
     */
    @Test
    public void testCourse()
    {
        libraryM3.setCourse("Software Development");
        assertEquals("Software Development", libraryM3.getCourse());
    }

    /**
     * Tests the setter and getter for notifications field.
     */
    @Test
    public void testNotifications()
    {
        libraryM3.sendNotifications("Hello world");
        assertEquals("\nHello world.\n", libraryM3.getNotifications());
    }

    /**
     * Tests for if the member is not holding a book.
     * Number of books borrowed is 0 and returns false
     * since the member is not borrowing.
     */
    @Test
    public void testNotBorrowing()
    {
        assertEquals(0, libraryM3.getNoOfBooksBorrowed());
        assertEquals(false, libraryM3.getBorrowing());
    }

    /**
     * Tests for if the member is holding a book.
     * Number of books borrowed is 1 and returns true
     * since the member is borrowing a book.
     */
    @Test
    public void testIsBorrowing()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        libraryM3.addBook(physical1);
        assertEquals(1, libraryM3.getNoOfBooksBorrowed());
        assertEquals(true, libraryM3.getBorrowing());
    }

    /**
     * Tests the print method to display that
     * the member is currently holding 1 book.
     */
    @Test
    public void testMemberDetailsIsBorrowing()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        libraryM3.addBook(physical1);
        libraryM3.printLibraryMemberDetails();
    }

    /**
     * Tests the print method to display that
     * the member is currently holding no book.
     */
    @Test
    public void testMemberDetailsNotBorrowing()
    {
        libraryM3.printLibraryMemberDetails();
        assertEquals(false, libraryM3.getBorrowing());
    }
}

















