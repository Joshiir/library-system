/**
 * Represents an electronic device 
 * (a computer, a tablet, an e-book reader etc) 
 * in the library building.
 *
 * @author Joshua Reid
 * @version 02/12/2021
 */
public class ElectronicDevice
{
    private String device;
    private String location;
    private LibraryMember member;
    
    /**
     * Constructor for objects of class ElectronicDevice.
     * Insert the device name and the location of it.
     * 
     * @param device    The device to be added.
     * @param location  The location of the device.
     */
    public ElectronicDevice(String device, String location)
    {
        this.device = device;
        this.location = location;
    }

    /**
     * Returns the device name.
     * 
     * @return      The device name.
     */
    public String getDeviceName()
    {
        return device;
    }
    
    /**
     * Returns the location of the device.
     * 
     * @return      The device location.
     */
    public String getDeviceLocation()
    {
        return location;
    }
    
    /**
     * Set the ownership of the device to a library member.
     * 
     * @param member    The library member to be added ownership.
     */
    public void setDeviceName(String device)
    {
        this.device = device;
    }
    
    /**
     * Set the ownership of the device to a library member.
     * 
     * @param member    The library member to be added ownership.
     */
    public void setDeviceLocation(String location)
    {
        this.location = location;
    }
    
    /**
     * Set the ownership of the device to a library member.
     * 
     * @param member    The library member to be added ownership.
     */
    public void setLibraryMember(LibraryMember member)
    {
        this.member = member;
    }

    /**
     * Checks the availability of the book, true if the device is available,
     * false if it is not.
     * 
     * @return true     The device is available.
     * @return false    The device is not available.
     */
    public boolean getAvailabilityOfDevice()
    {
        if (member == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Prints if the selected device is available and where it can be found,
     * Otherwise prints the device is not available.
     * 
     */
    public void printDeviceDetails()
    {    
        if (getAvailabilityOfDevice() == true) {
            System.out.println(device + " is currently available." + "\n" + "Device Location: " + location);
        }
        else {
            System.out.println(device + " is not available.");
        }
    }
}
