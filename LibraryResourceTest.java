

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryResourceTest.
 * All setters/getters and methods are tested.
 * All methods are tested for functioning together.
 *
 * @author  Joshua Reid
 * @version 02/12/2021
 */
public class LibraryResourceTest
{
    private LibraryResource libraryR1;

    /**
     * Default constructor for test class LibraryResourceTest
     */
    public LibraryResourceTest()
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
        libraryR1 = new LibraryResource("Head first Java");
        libraryR1.setAuthor("Kathy Sierra");
        libraryR1.setEdition("Second edition");
        libraryR1.setIsbn("0596009208");
        libraryR1.setPublicationYear(2005);
        libraryR1.setPublisher("O'Reilly");
        libraryR1.setTypeOfResource("Physical");
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
     * Tests the setter and getter for if available.
     * The resource is available as it is true.
     */
    @Test
    public void testIsAvailable()
    {
        libraryR1.setAvailable(true);
        assertEquals(true, libraryR1.getAvailable());
    }
    
    /**
     * Tests the setter and getter for if not available.
     * The resource is not available as it is false.
     */
    @Test
    public void testNotAvailable()
    {
        libraryR1.setAvailable(false);
        assertEquals(false, libraryR1.getAvailable());
    }

    /**
     * Tests the setter and getter for type field.
     */
    @Test
    public void testType()
    {
        libraryR1.setTypeOfResource("Physical");
        assertEquals("Physical", libraryR1.getTypeOfResource());
    }
    
    /**
     * Tests the setter and getter for title field.
     */
    @Test
    public void testTitle()
    {
        libraryR1.setTitle("Head first Java");
        assertEquals("Head first Java", libraryR1.getTitle());
    }
    
    /**
     * Tests the setter and getter for author field.
     */
    @Test
    public void testAuthor()
    {
        libraryR1.setAuthor("Kathy Sierra");
        assertEquals("Kathy Sierra", libraryR1.getAuthor());
    }
    
    /**
     * Tests the setter and getter for isbn field.
     */
    @Test
    public void testIsbn()
    {
        libraryR1.setIsbn("9781292159041");
        assertEquals("9781292159041", libraryR1.getIsbn());
    }
    
    /**
     * Tests the setter and getter for edition field.
     */
    @Test
    public void testEdition()
    {
        libraryR1.setEdition("Second edition");
        assertEquals("Second edition", libraryR1.getEdition());
    }
    
    /**
     * Tests the setter and getter for publication field.
     */
    @Test
    public void testPublicationYear()
    {
        libraryR1.setPublicationYear(2006);
        assertEquals(2006, libraryR1.getPublicationYear());
    }
    
    /**
     * Tests the setter and getter for publisher field.
     */
    @Test
    public void testPublisher()
    {
        libraryR1.setPublisher("O'Reilly");
        assertEquals("O'Reilly", libraryR1.getPublisher());
    }
}








