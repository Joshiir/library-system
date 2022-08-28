
/**
 * The test class ElectronicDeviceTest.
 * All setters/getters and methods are tested.
 * All methods are tested for functioning together.
 *
 * @author  Joshua Reid
 * @version 02/12/2021
 */
public class ElectronicDeviceTest
{
    private ElectronicDevice electron1;
    private ElectronicDevice electron2;
    private ElectronicDevice electron3;

    /**
     * Default constructor for test class ElectronicDeviceTest
     */
    public ElectronicDeviceTest()
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
        electron1 = new ElectronicDevice("Computer", "Level 3");
        electron2 = new ElectronicDevice("Tablet", "Level 4");
        electron3 = new ElectronicDevice("Reader", "Level 4");
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
     * Tests that the getter for device location is
     * equal to Tablet.
     */
    @Test
    public void testDeviceName()
    {
        electron1.setDeviceName("Tablet");
        assertEquals("Tablet", electron1.getDeviceName());
    }
    
    /**
     * Tests that the getter for device location is
     * equal to Level 3
     */
    @Test
    public void testDeviceLocation()
    {
        electron1.setDeviceLocation("Level 3");
        assertEquals("Level 3", electron1.getDeviceLocation());
    }
    
    /**
     * Tests that the device is available.
     * Is true as no student has been assigned to it.
     */
    @Test
    public void testDeviceisAvailable()
    {
        assertEquals(true, electron1.getAvailabilityOfDevice());
    }

    /**
     * Tests the device is not available (false) when a
     * library member has been set.
     */
    @Test
    public void testDeviceNotAvailable()
    {
        LibraryMember libraryM1 = new LibraryMember("Alice", "194759358", "CIS", "Software Development");
        electron1.setLibraryMember(libraryM1);
        assertEquals(false, electron1.getAvailabilityOfDevice());
    }
}





