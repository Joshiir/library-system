

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PhysicalBookTest.
 * All setters/getters and methods are tested.
 * All methods are tested for functioning together.
 *
 * @author  Joshua Reid
 * @version 02/12/2021
 */
public class PhysicalBookTest
{
    private PhysicalBook physical1;
    private PhysicalBook physical2;
    private PhysicalBook physical3;

    /**
     * Default constructor for test class PhysicalBookTest
     */
    public PhysicalBookTest()
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
        physical1 = new PhysicalBook("Objects first with Java : a practical introduction using BlueJ");
        physical1.setAuthor("David John");
        physical1.setEdition("Sixth edition");
        physical1.setIsbn("9781292159041");
        physical1.setPublicationYear(2016);
        physical1.setPublisher("Pearson Education Limited");
        physical1.setTypeOfResource("Physical");
        physical2 = new PhysicalBook("Head first Java");
        physical2.setAuthor("Kathy Sierra");
        physical2.setEdition("Second edition");
        physical2.setIsbn("0596009208");
        physical2.setPublicationYear(2005);
        physical2.setPublisher("O'Reilly");
        physical2.setTypeOfResource("Physical");
        physical3 = new PhysicalBook("Python crash course : a hands-on, project-based introduction to programming");
        physical3.setAuthor("Eric Matthes");
        physical3.setEdition("Second edition");
        physical3.setIsbn("9781593279288");
        physical3.setPublicationYear(2019);
        physical3.setPublisher("No Starch Press");
        physical3.setTypeOfResource("Physical");
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
     * Tests that any new initial damage is added
     * to the damages field of a book.
     */
    @Test
    public void testDamages()
    {
        physical1.updateDamage("Torn page");
        assertEquals("Torn page. ", physical1.getDamages());
    }
    
    /**
     * Tests that the damage field is updated
     * to have new damage added.
     */
    @Test
    public void testUpdateDamage()
    {
        physical1.updateDamage("Missing pages");
        physical1.updateDamage("Stained cover");
        assertEquals("Missing pages. Stained cover. ", physical1.getDamages());
    }

    /**
     * Tests that the book is available (true) as there
     * is no library member added to it.
     */
    @Test
    public void TestBookAvailable()
    {
        LibraryMember libraryM1 = new LibraryMember("Alice", "194759358", "CIS", "Software Development");
        assertEquals(true, physical1.isAvailable());
    }

    /**
     * Tests that the book is not available (false) as there
     * is a library member added to it.
     */
    @Test
    public void testBookNotAvailable()
    {
        LibraryMember libraryM1 = new LibraryMember("Alice", "194759358", "CIS", "Software Development");
        physical1.setLibraryMember(libraryM1);
        assertEquals(false, physical1.isAvailable());
    }

    /**
     * Tests the inherited setter and getter for type field.
     */
    @Test
    public void testType()
    {
        physical1.setTypeOfResource("Physical");
        assertEquals("Physical", physical1.getTypeOfResource());
    }
    
    /**
     * Tests the inherited setter and getter for title field.
     */
    @Test
    public void testTitle()
    {
        physical1.setTitle("Head first Java");
        assertEquals("Head first Java", physical1.getTitle());
    }
    
    /**
     * Tests the inherited setter and getter for author field.
     */
    @Test
    public void testAuthor()
    {
        physical1.setAuthor("Kathy Sierra");
        assertEquals("Kathy Sierra", physical1.getAuthor());
    }
    
    /**
     * Tests the inherited setter and getter for isbn field.
     */
    @Test
    public void testIsbn()
    {
        physical1.setIsbn("9781292159041");
        assertEquals("9781292159041", physical1.getIsbn());
    }
    
    /**
     * Tests the inherited setter and getter for edition field.
     */
    @Test
    public void testEdition()
    {
        physical1.setEdition("Second edition");
        assertEquals("Second edition", physical1.getEdition());
    }
    
    /**
     * Tests the inherited setter and getter for publication field.
     */
    @Test
    public void testPublicationYear()
    {
        physical1.setPublicationYear(2006);
        assertEquals(2006, physical1.getPublicationYear());
    }
    
    /**
     * Tests the inherited setter and getter for publisher field.
     */
    @Test
    public void testPublisher()
    {
        physical1.setPublisher("O'Reilly");
        assertEquals("O'Reilly", physical1.getPublisher());
    }
}







