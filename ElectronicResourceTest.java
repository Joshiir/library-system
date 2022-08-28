

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElectronicResourceTest.
 * All setters/getters and methods are tested.
 * All methods are tested for functioning together.
 *
 * @author  Joshua Reid
 * @version 02/12/2021
 */
public class ElectronicResourceTest
{
    private ElectronicResource electronic1;
    private ElectronicResource electronic2;
    private ElectronicResource electronic3;
    
    /**
     * Default constructor for test class ElectronicResourceTest
     */
    public ElectronicResourceTest()
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
        electronic1 = new ElectronicResource("Objects first with Java : a practical introduction using BlueJ");
        electronic1.setAuthor("David John");
        electronic1.setEdition("Sixth edition");
        electronic1.setIsbn("9781292159041");
        electronic1.setPublicationYear(2016);
        electronic1.setPublisher("Pearson Education Limited");
        electronic1.setTypeOfResource("Electronic");
        electronic2 = new ElectronicResource("Head first Java");
        electronic2.setAuthor("Kathy Sierra");
        electronic2.setEdition("Second edition");
        electronic2.setIsbn("0596009208");
        electronic2.setPublicationYear(2005);
        electronic2.setPublisher("O'Reilly");
        electronic2.setTypeOfResource("Electronic");
        electronic3 = new ElectronicResource("Python crash course : a hands-on, project-based introduction to programming");
        electronic3.setAuthor("Eric Matthes");
        electronic3.setEdition("Second edition");
        electronic3.setIsbn("9781593279288");
        electronic3.setPublicationYear(2019);
        electronic3.setPublisher("No Starch Press");
        electronic3.setTypeOfResource("Electronic");
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
     * A new device is added to the device ArrayList
     */
    @Test
    public void testAddDevice()
    {
        ElectronicDevice electron1 = new ElectronicDevice("Computer", "Level 3");
        electronic1.addDevice(electron1);
    }

    /**
     * An error message is printed if duplicate devices are added to
     * the same resource.
     */
    @Test
    public void testAddDuplicateDevices()
    {
        ElectronicDevice electron1 = new ElectronicDevice("Computer", "Level 3");
        electronic1.addDevice(electron1);
        electronic1.addDevice(electron1);
    }
    
    /**
     * Tests the inherited setter and getter for type field.
     */
    @Test
    public void testType()
    {
        electronic1.setTypeOfResource("Physical");
        assertEquals("Physical", electronic1.getTypeOfResource());
    }
    
    /**
     * Tests the inherited setter and getter for title field.
     */
    @Test
    public void testTitle()
    {
        electronic1.setTitle("Head first Java");
        assertEquals("Head first Java", electronic1.getTitle());
    }
    
    /**
     * Tests the inherited setter and getter for author field.
     */
    @Test
    public void testAuthor()
    {
        electronic1.setAuthor("Kathy Sierra");
        assertEquals("Kathy Sierra", electronic1.getAuthor());
    }
    
    /**
     * Tests the inherited setter and getter for isbn field.
     */
    @Test
    public void testIsbn()
    {
        electronic1.setIsbn("9781292159041");
        assertEquals("9781292159041", electronic1.getIsbn());
    }
    
    /**
     * Tests the inherited setter and getter for edition field.
     */
    @Test
    public void testEdition()
    {
        electronic1.setEdition("Second edition");
        assertEquals("Second edition", electronic1.getEdition());
    }
    
    /**
     * Tests the inherited setter and getter for publication field.
     */
    @Test
    public void testPublicationYear()
    {
        electronic1.setPublicationYear(2006);
        assertEquals(2006, electronic1.getPublicationYear());
    }
    
    /**
     * Tests the inherited setter and getter for publisher field.
     */
    @Test
    public void testPublisher()
    {
        electronic1.setPublisher("O'Reilly");
        assertEquals("O'Reilly", electronic1.getPublisher());
    }
}


