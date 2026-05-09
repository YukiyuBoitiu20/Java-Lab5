/**
 * Represents a generic Person.
 * CITATION:Watched Ch10 video archives,recaps Zoom Ch10 and
 * Java tutorials on YouTube.
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-05-08
 */
public class Person {
    private String name;
    public static final int CURRENT_YEAR = 2025;
    /**
     * Default constructor sets name to a default value.
     */
    public Person() {
        name = "No name yet";
    }
    /**
     * Constructor that accepts a name.
     * @param name The person's name.
     */
    public Person(String name) {
        this.name = name;
    }
    /**
     * Sets the person's name.
     * @param name The new name.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the person's name.
     * @return The name string.
     */
    public String getName() {
        return name;
    }
    /**
     * Returns a string representation of the Person.
     * @return Formatted string with the name.
     */
    public String toString() {
        return "Name: " + name;
    }
}