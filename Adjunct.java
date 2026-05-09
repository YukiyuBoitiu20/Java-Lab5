/**
 * Represents an Adjunct Employee paid by the hour.
 * CITATION:Watched Ch10 video archives,recaps Zoom Ch10 and
 * Java tutorials on YouTube..
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-05-08
 */
public class Adjunct extends Employee {
    private double hours;
    private double hrRate;
    /**
     * Default constructor.
     */
    public Adjunct() {
        super();
        hours = 0.0;
        hrRate = 0.0;
    }
    /**
     * Constructor accepting adjunct employee details.
     * @param name The employee's name.
     * @param hireYear The year they were hired.
     * @param idNum Their unique ID number.
     * @param hours The hours worked.
     * @param hrRate The hourly pay rate.
     */
    public Adjunct(String name, int hireYear, String idNum, double hours, double hrRate) {
        super(name, hireYear, idNum);
        this.hours = hours;
        this.hrRate = hrRate;
    }
    /**
     * Sets the hours worked.
     * @param hours The hours worked.
     */
    public void setHours(double hours) { 
        this.hours = hours; 
    }
    /**
     * Gets the hours worked.
     * @return The hours.
     */
    public double getHours() { 
        return hours; 
    }
    /**
     * Sets the hourly rate.
     * @param hrRate The pay rate.
     */
    public void setHrRate(double hrRate) { 
        this.hrRate = hrRate; 
    }
    /**
     * Gets the hourly rate.
     * @return The pay rate.
     */
    public double getHrRate() { 
        return hrRate; 
    }
    /**
     * Calculates the total salary for the adjunct employee.
     * @return The total salary (hours * hrRate).
     */
    public double getSalary() {
        return hours * hrRate;
    }
    /**
     * Returns a formatted string representation of the Adjunct employee.
     * @return String containing employee data and formatted currency.
     */
    public String toString() {
        return super.toString() + String.format("\nHours: %.1f, Hourly Rate: %.2f, Salary: $%,.2f", hours, hrRate, getSalary());
    }
}