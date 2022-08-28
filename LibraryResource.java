
/**
 * This is a super class that stores common information shared between resources used in a library.
 * Implement information including the availability, type of resource (Physical, Electronic),
 * the title of the resource, the author, ISBN, edition, the publication year and who the
 * publisher is.
 *
 * @author Joshua Reid
 * @version 02/12/2021
 */
public class LibraryResource
{
    private boolean available;
    private String type;
    private String title;
    private String author;
    private String isbn;
    private String edition;
    private int publication;
    private String publisher;

    /**
     * Constructor for objects of class Catalogue
     * Insert the title of the resource, stores the availability,
     * type, title, author, isbn, edition, publication year and 
     * publisher.
     * 
     * @param title     The title of this library resource.
     */
    public LibraryResource(String title)
    {
        available = true;
        type = "";
        this.title = title;
        author = "";
        isbn = "";
        edition = "";
        publication = 0;
        publisher = "";
    }
    
    /**
     * Get the availability of the resource
     * Returns true if the resource is available, else returns false.
     * 
     * @return      true if resource is available, false if not.
     */
    public boolean getAvailable()
    {
        return available;
    }
    
    /**
     * Get what type of resource it is.
     * Return the type of resource.
     * 
     * @return      The type of resource.
     */
    public String getTypeOfResource()
    {
        return type;
    }
    
    /**
     * Get the title of the resource.
     * Return the title of the resource.
     * 
     * @return      The title of the resource.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Get the author of the resource.
     * Return the author of the resource.
     * 
     * @return      The author of the resource.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Get the ISBM of the resource.
     * Return the ISBN of the resource.
     * 
     * @return      The ISBN of the resource.
     */
    public String getIsbn()
    {
        return isbn;
    }
    
    /**
     * Get the edition of the resource
     * Return the edition of the resource.
     * 
     * @return      The edition of the resource.
     */
    public String getEdition()
    {
        return edition;
    }
    
    /**
     * Get the publication year of the resource.
     * Return the published year.
     * 
     * @return      The published year of the resource.
     */
    public int getPublicationYear()
    {
        return publication;
    }
    
    /**
     * Get the publisher of the resource.
     * Return the publisher of the resource.
     * 
     * @return      The publisher of the resource.
     */
    public String getPublisher()
    {
        return publisher;
    }
    
    /**
     * Set if the resource is available
     * True if it is available, false if it is not.
     * 
     * @param available      True if available, false if not.
     */
    public void setAvailable(boolean available)
    {
        this.available = available;
    }
    
    /**
     * Input the type of resource (Physical, Electronic).
     * 
     * @param type      The type of the resource (Physical, Electronic).
     */
    public void setTypeOfResource(String type)
    {
        this.type = type;
    }
    
    /**
     * Input the title of the resource.
     *
     * @param title     The title of the resource
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * Input the author of the resource.
     *
     * @param author    The author of the resource
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    /**
     * Input the ISBN of the resource.
     *
     * @param isbn      The ISBN of the resource
     */
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    /**
     * Input the edition of the resource.
     * 
     * @param edition   The edition of the resource
     */
    public void setEdition(String edition)
    {
        this.edition = edition;
    }
    
    /**
     * Input the year of publication.
     * 
     * @param publication       The year of publication.
     */
    public void setPublicationYear(int publication)
    {
        this.publication = publication;
    }
    
    /**
     * Input the publisher of the resource.
     * 
     * @param publisher         The publisher of the resource.
     */
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
    /**
     * Display the information of the resources type,
     * title, author, ISBN, edition, publication year
     * and the publisher.
     */
    public void display()
    {
        System.out.println("Type of resource: " + type);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Edition: " + edition);
        System.out.println("Publication: " + publication);
        System.out.println("Publisher: " + publisher);
    }
}
