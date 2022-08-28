import java.util.ArrayList;

/**
 * A class that represents the library.
 * The library class can be used to print details of the catalogue,
 * search the catalogue by different inputs,
 * create edits of the resources in the catalogue,
 * loan a book to a library member,
 * return a book from a library member,
 * and send messages/notification to other library members.
 *
 * @author      Joshua Reid
 * @version     02/12/2021
 */
public class Library
{
    private String libraryName;
    private String institution;
    private String address;
    private boolean accessibility; 
    private ArrayList<LibraryResource> catalogue;

    /**
     * Constructor for objects of class Library.
     * The library constructor is used to name the library and the instituion
     * the library is related to. There is also the catalogue of all resources
     * in the library.
     */
    public Library(String libraryName, String institution, String address, boolean accessibility)
    {
        this.libraryName = libraryName;
        this.institution = institution;
        this.address = address;
        this.accessibility = accessibility;
        catalogue = new ArrayList<>();
    }
    
    /**
     * Return the name of the library.
     * @return The library name.
     */
    public String getLibraryName()
    {
        return libraryName;
    }
    
    /**
     * Return the institution of the library.
     * @return the institution of the library.
     */
    public String getInstitution()
    {
        return institution;
    }
    
    /**
     * Return the address of the library
     * @return The address of the library
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * Return if the library is accessible, true if it is, false if not.
     * @return true if accessible, false if not.
     */
    public boolean getAccessibility()
    {
        return accessibility;
    }
    
    /**
     * Return the catalogue of the library
     * @return the catalogue of the library
     */
    public ArrayList<LibraryResource> getCatalogue()
    {
        return catalogue;
    }
    
    /**
     * Set the name of the library.
     * 
     */
    public void setLibraryName(String libraryName)
    {
        this.libraryName = libraryName;
    }
    
    /**
     * Set the institution of the library.
     * 
     */
    public void setInstitution(String institution)
    {
        this.institution = institution;
    }
    
    /**
     * Set the address of the library.
     * 
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /**
     * Set the accessibility of the library, true if it is, false if not.
     * 
     */
    public void setAccessibility(boolean accessibility)
    {
        this.accessibility = accessibility;
    }
    
    /**
     * Prints details of the library.
     * Print the institution, name of the library, address,
     * and whether it is accessible or not.
     * 
     */
    public void printLibraryDetails()
    {
        System.out.println("Institution: " + institution);
        System.out.println("Name of Library: " + libraryName);
        System.out.println("Address: " + address);
        if (getAccessibility() == true) {
            System.out.println("Accessibility features are available");
        }
        else {
            System.out.println("Accessibility features are not available");
        }
    }
    
    /**
     * Print details of every resource within the catalogue.
     */
    public void printCatalogueDetails()
    {
        System.out.println("Listing all catalogue details: " + "\n");
        
        for(LibraryResource resource : catalogue) {
            resource.display();
            System.out.println();   // empty line between posts
        }
    }
    
    /**
     * Checks the catalogue for if the resource already exists.
     * Returns true if the resource exists, false if not.
     * 
     * @param resource  The resource that is checked.
     */
    public boolean checkContainsResource(LibraryResource resource)
    {
        if (catalogue.contains(resource)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Edit the title of selected resource.
     * Prints and error message if the resource is not in
     * the catalogue.
     * 
     * @param resource  The resource to be edited.
     * @param title     The edited title.
     */
    public void editResourceTitle(LibraryResource resourceObject, String title)
    {
        for(LibraryResource resource : catalogue) {
            if(checkContainsResource(resourceObject) == true) {
                resource.setTitle(title);
            }
            else {
                System.out.println("Error: Cannot edit title of resource not in the catalogue.");
            }
        }
    }
    
    /**
     * Search the catalogue by resource object.
     * Returns the resource if the resource exists in the catalogue.
     * 
     * @param resource  The resource to be searched.
     */
    public LibraryResource searchByResource(LibraryResource resource)
    {       
        for(LibraryResource resources : catalogue) {
            if(catalogue.contains(resource)) {
                return resources;
            }
        }
        return null;
    }
    
    /**
     * Search the catalogue by ISBN, and how many results were found.
     * 
     * @param isbn  The ISBN to be searched.
     */
    public void searchByIsbn(String isbn)
    {
        System.out.println("Searching by ISBN: " + "\n");
        
        for(LibraryResource resource : catalogue) {
            if(resource.getIsbn().contains(isbn)) {
                resource.display();
                System.out.println();
                System.out.println("Resources found: " + catalogue.size());
            }
        }
    }
    
    /**
     * Search the catalogue by author and how many results were found.
     * 
     * @param author  The author name to be searched.
     */
    public void searchByAuthor(String author)
    {
        System.out.println("Searching by Author: " + "\n");
        
        for(LibraryResource resource : catalogue) {
            if(resource.getAuthor().contains(author)) {
                resource.display();
                System.out.println();
                System.out.println("Resources found: " + catalogue.size());
            }
        }
    }
    
    /**
     * Remove a selected resource from the catalogue.
     * Prints error if resource does not exist.
     * 
     * @param resource  The resource to be removed.
     */
    public void removeResourceFromCatalogue(LibraryResource resource)
    {
        if (catalogue.contains(resource)) {
            catalogue.remove(resource);
        }
        else {
            System.out.println("Error: Cannot remove resource that does not exist.");
        }
    }
    
    /**
     * Remove a resource from the selected position in the catalogue.
     * Prints error if index number is negative or greater than the
     * size of the catalogue.
     * 
     * @param index  The position to remove the resource from.
     */
    public void removeResourceAtPosition(int index)
    {
        if(index < 0) {
            System.out.println("Error: Index cannot be negative");
        }
        else if(index >= catalogue.size()) {
            System.out.println("Error: Index is too large");
        }
        else {
            catalogue.remove(index);
        }
    }
    
    /**
     * Prints the details of all available physical books 
     * (physical books currently not on loan).
     * 
     */
    public void printAllAvailableBookDetails()
    {
        System.out.println("Listing all available books: " + "\n");
        
        for(LibraryResource resource : catalogue) {
            if(resource.getAvailable() == true) {
                resource.display();
                System.out.println();
            }
        }
    }

    /**
     * The number of resources in the catalogue.
     * 
     * @return returns number of resources in the catalogue.
     */
    public int getNumberOfResources()
    {
        return catalogue.size();
    }
    
    /**
     * Add a resource to the library. 
     * Displays error if library already contains the resource
     * 
     * @param resource  The resource to be added.
     */
    public void addResource(LibraryResource resource)
    {
        if (checkContainsResource(resource) == true) {
            System.out.println("Error: This resource already exists in the catalogue!");
        }
        else {
            catalogue.add(resource);
        }
    }
    
    /**
     * Loan a book to a library member. Cannot loan a book if it does not
     * exist in the catalogue.
     * 
     * @param book      The book to be loaned.
     * @param member    The member the book will be loaned to.
     */
    public void loanBook(PhysicalBook book, LibraryMember member)
    {
        if (checkContainsResource(book) == true) {
            book.setLibraryMember(member);
            member.addBook(book);
            book.updateAvailable();
        }
        else {
            System.out.println("Error: Cannot loan book not found in catalogue.");
        }
    }
    
    /**
     * Return a book back to the library from a library member.
     * Can add new damage to the book if damage is true, no damage recorded if false.
     * Cannot return a book that did not exist in the catalogue.
     * 
     * @param book                  The book to be returned.
     * @param damage                True if there is damage, false if there is not.
     * @param damageDescription     The description of the new damage.
     */
    public void returnBook(PhysicalBook book, boolean damage, String damageDescription)
    {
        if (checkContainsResource(book) == true) {
            book.setLibraryMember(null);
            book.updateAvailable();
            if (damage == true) {
                book.updateDamage(damageDescription);
                System.out.println("Success: Book returned and damage recorded.");
            }
            else {
                System.out.println("Success: Book returned and no damage recorded.");
            }
        }
        else {
            System.out.println("Error: Cannot return book not found in catalogue.");
        }
    }
    
    /**
     * Send messages/notifications to other library members that are holding physical books.
     * 
     * @param message   The message to be sent to other library members holding physical books.
     */
    public void sendMessageHoldingBooks(String message)
    {
        for(LibraryResource resource : catalogue) {
            LibraryMember member = new LibraryMember();
            if(resource.getAvailable() == false) {
                member.sendNotifications(message);
            }
        }
    }
    
    /**
     * Print all details of physical book resources only from the catalogue.
     * 
     */
    public void printAllPhysicalBookResources()
    {
        System.out.println("Listing all physical books: " + "\n");
        
        for(LibraryResource resource : catalogue) {
            if (resource instanceof PhysicalBook)   {
                resource.display();
                System.out.println();
            }
        }
    }
    
    /**
     * Print all details of electronic resources only from the catalogue.
     * 
     */
    public void printAllElectronicResources()
    {
        System.out.println("Listing all electronic resources: " + "\n");
        
        for(LibraryResource resource : catalogue) {
            if (resource instanceof ElectronicResource)   {
                resource.display();
                System.out.println();
            }
        }
    }
}
