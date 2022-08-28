/**
 * Represents a physical book that can be borrowed,
 * if it is available and whether new damages should
 * be added to the book if detected.
 *
 * @author Joshua Reid
 * @version 02/12/2021
 */
public class PhysicalBook extends LibraryResource
{
    private LibraryMember member;
    private String damages;
    
    /**
     * Constructor for objects of class PhysicalBook.
     * Insert the title of the resource
     * 
     * @param title     The title of the book.
     */
    public PhysicalBook(String title)
    {
        super(title);
        member = null;
        damages = "";
    }
    
    /**
     * The damages to the book.
     * 
     */
    public String getDamages()
    {
        return damages;
    }
    
    /**
     * Set the ownership of the book to a library member.
     * 
     * @param member    The library member to be added ownership.
     */
    public void setLibraryMember(LibraryMember member)
    {
        this.member = member;
    }
    
    /**
     * Check the availability of the book if a library member
     * has been given ownership.
     * 
     */
    public boolean isAvailable()
    {
        if (member == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Updates whether the book is available, true if it is available,
     * false if it is not available
     * 
     */
    public void updateAvailable()
    {
        if (isAvailable() == true) {
            setAvailable(true);
        }
        else {
            setAvailable(false);
        }
    }
    
    /**
     * Update damages to the book if detected.
     * 
     * @param addDamage  Updates the damage to the book.
     */
    public void updateDamage(String addDamage)
    {
        damages += addDamage + ". ";
    }
    
    /**
     * Prints details of the books availability, and damages if there is any.
     * 
     */
    public void printBookDetails()
    {
        if (isAvailable() == true) {
            System.out.println("The book is currently available.");
        }
        else {
            System.out.println("The book is not available.");
        }
        if (damages.isEmpty()) {
            System.out.println("Damages: " + "No damages");
        }
        else {
            System.out.println("Damages: " + damages);
        }
    }
    
    /**
     * Override method so as to insert shared resource information from the super class.
     * Determines whether the book is available and what damages to show, if any.
     * 
     */
    @Override
    public void display()
    {
        if (isAvailable() == true) {
            System.out.println("The book is currently available.");
        }
        else {
            System.out.println("The book is not available.");
        }
        super.display();
        if (damages.isEmpty()) {
            System.out.println("Damages: " + "No damages");
        }
        else {
            System.out.println("Damages: " + damages);
        }
    }
}