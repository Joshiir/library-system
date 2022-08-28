import java.util.ArrayList;

/**
 * Represents electronic resources
 * such as e-books, journals, articles etc.
 *
 * @author Joshua Reid
 * @version 02/12/2021
 */
public class ElectronicResource extends LibraryResource
{
    private ArrayList<ElectronicDevice> devices;

    /**
     * Constructor for objects of class ElectronicResource.
     * Insert the title of the resource
     * 
     * @param title     The title of this resource.
     */
    public ElectronicResource(String title)
    {
        super(title);
        devices = new ArrayList<ElectronicDevice>();
    }
    
    /**
     * The collection of devices added.
     * 
     * @return      returns the collection of devices.
     */
    public ArrayList<ElectronicDevice> getDevices()
    {
        return devices;
    }
    
    /**
     * Add a device to this electronic resource.
     * 
     * @param device      A device to be added to the collection.
     */    
    public void addDevice(ElectronicDevice device)
    {
        if (devices.contains(device)) {
            System.out.println("Error: cannot add the same device twice to the collection!");
        }
        else {
            devices.add(device);
        }
    }
    
    /**
     * Prints details of the electronic resource.
     * Prints error message if no device is detected.
     */
    public void printElectronicResourceDetails()
    {
        for (ElectronicDevice device: devices)  {
            device.printDeviceDetails();
        }
        if (devices.isEmpty()) {
            System.out.println("Error: no device detected!");
        }
    }
    
    /**
     * Override method so as to insert shared resource information from the super class.
     * Prints details of the electronic resource.
     * Prints error if no device is detected.
     */
    @Override
    public void display()
    {
        for (ElectronicDevice device: devices)  {
            device.printDeviceDetails();
        }
        super.display();
        if (devices.isEmpty()) {
            System.out.println("Error: no device detected!");
        }
    }
}
