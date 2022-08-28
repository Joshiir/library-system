

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryTest.
 * All setters/getters and methods are tested.
 * All methods are tested for functioning together.
 *
 * @author  Joshua Reid
 * @version 02/12/2021
 */
public class LibraryTest
{
    private Library library1;

    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
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
        library1 = new Library("Andersonian Library", "University of Strathclyde", "101 St James Rd", true);
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
     * Tests the setter and getter for libraryName field.
     */
    @Test
    public void testLibraryName()
    {
        library1.setLibraryName("Andersonian Library");
        assertEquals("Andersonian Library", library1.getLibraryName());
    }

    /**
     * Tests the setter and getter for institution field.
     */
    @Test
    public void testInstitution()
    {
        library1.setInstitution("University of Strathclyde");
        assertEquals("University of Strathclyde", library1.getInstitution());
    }

    /**
     * Tests the setter and getter for address field.
     */
    @Test
    public void testAddress()
    {
        library1.setAddress("101 St James Rd");
        assertEquals("101 St James Rd", library1.getAddress());
    }

    /**
     * Tests the setter and getter for accessibility field.
     * Is true as it is accessible.
     */
    @Test
    public void testIsAccessible()
    {
        library1.setAccessibility(true);
        assertEquals(true, library1.getAccessibility());
    }

    /**
     * Tests the setter and getter for accessibility field.
     * Is false as it is not accessible.
     */
    @Test
    public void testNotAccessible()
    {
        library1.setAccessibility(false);
        assertEquals(false, library1.getAccessibility());
    }
    
    /**
     * Tests for adding a new resource to the catalogue.
     * Catalogue is checked it contains the resource after being added (true).
     */
    @Test
    public void testAddResource()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        library1.addResource(physical1);
        assertEquals(true, library1.checkContainsResource(physical1));
    }

    /**
     * Adds a duplicate resource to the catalogue.
     * Prints error message as duplicate resources are not allowed.
     */
    @Test
    public void testAddDuplicateResource()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        library1.addResource(physical1);
        library1.addResource(physical1);
    }

    /**
     * Checks catalogue if resource is not contained in it.
     * It is false as the resource does not exist in the catalogue.
     */
    @Test
    public void testNotContainsResource()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        assertEquals(false, library1.checkContainsResource(physical1));
    }

    /**
     * The physical resource has its title edited from
     * "Head first Java" to "New Title", and the getter confirms
     * the title has been updated.
     */
    @Test
    public void testEditResourceTitle()
    {
        PhysicalBook physical4 = new PhysicalBook("Head first Java");
        library1.addResource(physical4);
        library1.editResourceTitle(physical4, "New Title");
        assertEquals("New Title", physical4.getTitle());
    }

    /**
     * Three resources are added to the catalogue and then
     * the getter is used to confirm that three resources now exist.
     */
    @Test
    public void testGetNumberOfResources()
    {
        PhysicalBook physical1 = new PhysicalBook("Book 1");
        PhysicalBook physical2 = new PhysicalBook("Book 2");
        PhysicalBook physical3 = new PhysicalBook("Book 3");
        library1.addResource(physical1);
        library1.addResource(physical2);
        library1.addResource(physical3);
        assertEquals(3, library1.getNumberOfResources());
    }

    /**
     * A physical book is added to the library catalogue,
     * the book is loaned by selecting the member and the book,
     * the book is no longer available (false) and the member
     * is confirmed to be borrowing a book (true).
     */
    @Test
    public void testLoanBook()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        LibraryMember libraryM1 = new LibraryMember("Alice", "129754386", "CIS", "Software Development");
        library1.addResource(physical1);
        library1.loanBook(physical1, libraryM1);
        assertEquals(false, physical1.isAvailable());
        assertEquals(true, libraryM1.getBorrowing());
    }

    /**
     * A new physical book resource is added to the catalogue.
     * Testing the error messages work by attempting a negative number and
     * a number out of range of the catalogue size.
     * Resource is then removed from the catalogue and checked it is removed.
     */
    @Test
    public void testRemoveResourceAtPosition()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        library1.addResource(physical1);
        library1.removeResourceAtPosition(1);
        library1.removeResourceAtPosition(-1);
        library1.removeResourceAtPosition(0);
        assertEquals(false, library1.checkContainsResource(physical1));
    }

    /**
     * New physical book is added to the catalogue.
     * Checks the resource is in the catalogue.
     * Resource is removed from the catalogue and checked it is removed.
     */
    @Test
    public void testRemoveResourceFromCatalogue()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        library1.addResource(physical1);
        assertEquals(true, library1.checkContainsResource(physical1));
        library1.removeResourceFromCatalogue(physical1);
        assertEquals(false, library1.checkContainsResource(physical1));
    }

    /**
     * A physical book is added to the catalogue.
     * The resource is returned by selecting the resource,
     * that there is no damage (false), and a blank description field.
     */
    @Test
    public void testReturnBookNoDamage()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        LibraryMember libraryM1 = new LibraryMember("Alice", "129754386", "CIS", "Software Development");
        library1.addResource(physical1);
        library1.returnBook(physical1, false, "");
    }

    /**
     * A physical book is added to the catalogue.
     * The resource is returned by selecting the resource,
     * that there is damage (true), and a desciption of the new damage.
     * It is checked that the new damage has been added to the resource.
     */
    @Test
    public void testBookReturnWithDamage()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        LibraryMember libraryM1 = new LibraryMember("Alice", "129754386", "CIS", "Software Development");
        library1.addResource(physical1);
        library1.loanBook(physical1, libraryM1);
        library1.returnBook(physical1, true, "Missing page");
        assertEquals("Missing page. ", physical1.getDamages());
    }

    /**
     * A physical book not in the catalogue is returned.
     * Prints an error message as it does not exist in
     * the catalogue
     */
    @Test
    public void testReturnNotInCatalogue()
    {
        PhysicalBook physical1 = new PhysicalBook("Head first Java");
        LibraryMember libraryM1 = new LibraryMember("Alice", "129754386", "CIS", "Software Development");
        library1.returnBook(physical1, false, "");
    }

    /**
     * Three new resources are added to the catalogue,
     * searching by author prints the details of the
     * books found with the authors name as its field.
     */
    @Test
    public void testSearchAuthor()
    {
        PhysicalBook physical1 = new PhysicalBook("Book 1");
        PhysicalBook physical2 = new PhysicalBook("Book 2");
        PhysicalBook physical3 = new PhysicalBook("Book 3");
        physical1.setAuthor("Bob");
        physical2.setAuthor("Alice");
        physical3.setAuthor("Oscar");
        library1.addResource(physical1);
        library1.addResource(physical2);
        library1.addResource(physical3);
        library1.searchByAuthor("Bob");
        library1.searchByAuthor("Alice");
        library1.searchByAuthor("Oscar");
    }

    /**
     * Three new resources are added to the catalogue,
     * searching by ISBN prints the details of the
     * books found with the ISBN number as its field.
     */
    @Test
    public void testSearchIsbn()
    {
        PhysicalBook physical1 = new PhysicalBook("Book 1");
        PhysicalBook physical2 = new PhysicalBook("Book 2");
        PhysicalBook physical3 = new PhysicalBook("Book 3");
        physical1.setIsbn("9781292159041");
        physical2.setIsbn("0596009208");
        physical3.setIsbn("9781593279288");
        library1.addResource(physical1);
        library1.addResource(physical2);
        library1.addResource(physical3);
        library1.searchByIsbn("9781292159041");
        library1.searchByIsbn("9781593279288");
        library1.searchByIsbn("0596009208");
    }

    /**
     * Three new resources are added to the catalogue,
     * searching by resource returns the resource.
     */
    @Test
    public void testSearchResource()
    {
        PhysicalBook physical1 = new PhysicalBook("Book 1");
        PhysicalBook physical2 = new PhysicalBook("Book 2");
        PhysicalBook physical3 = new PhysicalBook("Book 3");
        library1.addResource(physical1);
        library1.addResource(physical2);
        library1.addResource(physical3);
        library1.searchByResource(physical1);
        library1.searchByResource(physical2);
        library1.searchByResource(physical3);
    }
}



















