/**
 * Represents a Full Time Employee with a set salary.
 * CITATION:Watched Ch10 video archives,recaps Zoom Ch10 and
 * Java tutorials on YouTube.
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-05-08
 */
public class FullTime extends Employee {
    private double salary;
    /**
     * Default constructor.
     */
    public FullTime() {
        super();
        salary = 0.0;
    }
    /**
     * Constructor accepting full time employee details.
     * @param name The employee's name.
     * @param hireYear The year they were hired.
     * @param idNum Their unique ID number.
     * @param salary Their annual salary.
     */
    public FullTime(String name, int hireYear, String idNum, double salary) {
        super(name, hireYear, idNum);
        this.salary = salary;
    }
    /**
     * Sets the salary.
     * @param salary The employee's salary.
     */
    public void setSalary(double salary) { 
        this.salary = salary; 
    }
    /**
     * Gets the salary.
     * @return The employee's salary.
     */
    public double getSalary() { 
        return salary; 
    }
    /**
     * Returns a formatted string representation of the FullTime employee.
     * @return String containing employee data and formatted currency.
     */
    public String toString() {
        return super.toString() + String.format("\nSalary: $%,.2f", salary);
    }
}