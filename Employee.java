/**
 * Represents an Employee, inheriting from Person.
 * CITATION:Watched Ch10 video archives,recaps Zoom Ch10 and
 * Java tutorials on YouTube.
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-05-08
 */
public class Employee extends Person {
    private int hireYear;
    private String idNum;
    /**
     * Default constructor calling the superclass constructor.
     */
    public Employee() {
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }
    /**
     * Constructor accepting name, hire year, and ID.
     * @param name The employee's name.
     * @param hireYear The year they were hired.
     * @param idNum Their unique ID number.
     */
    public Employee(String name, int hireYear, String idNum) {
        super(name);
        this.hireYear = hireYear;
        this.idNum = idNum;
    }
    /**
     * Sets the hire year.
     * @param hireYear The year the employee was hired.
     */
    public void setHireYear(int hireYear) { 
        this.hireYear = hireYear; 
    }
    /**
     * Gets the hire year.
     * @return The year hired.
     */
    public int getHireYear() { 
        return hireYear; 
    }
    /**
     * Sets the ID number.
     * @param idNum The employee ID.
     */
    public void setIdNum(String idNum) { 
        this.idNum = idNum; 
    }
    /**
     * Gets the ID number.
     * @return The employee ID.
     */
    public String getIdNum() { 
        return idNum; 
    }
    /**
     * Calculates the employee's years of service.
     * @return The difference between CURRENT_YEAR and hireYear.
     */
    public int getServiceYears() {
        return CURRENT_YEAR - hireYear;
    }
    /**
     * Checks if two employees are identical based on their ID number.
     * @param o The object to compare against.
     * @return True if they have the same ID, false otherwise.
     */
    public boolean equals(Object o) {
        boolean isEqual = false;
        if (o != null && getClass() == o.getClass()) {
            Employee copy = (Employee) o;
            if (idNum.equalsIgnoreCase(copy.idNum)) {
                isEqual = true;
            }
        }
        return isEqual;
    }
    /**
     * Returns a string representation incorporating the superclass toString.
     * @return Formatted string with employee details.
     */
    public String toString() {
        return super.toString() + "\nID Number: " + idNum + "\nYear Hired: " + hireYear + ", Years Of Service: " + getServiceYears();
    }
}