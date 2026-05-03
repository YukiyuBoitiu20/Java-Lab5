/**
 * Calculates the total cost of carpet for a specific room.
 * CITATION: Watched YouTube video tutorials and video archives
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-05-03
 */
public class CarpetCost {
    private RoomSize size;
    private double costPerSqFt;

    /**
     * Constructor
     * @param area The RoomSize object containing dimensions.
     * @param cost The cost of the carpet per square foot.
     */
    public CarpetCost(RoomSize area, double cost) {
        
        size = new RoomSize(area);
        costPerSqFt = cost;
    }

    /**
     * Calculates the total cost of the carpet.
     * @return The total cost (area * cost per sq ft).
     */
    public double getCost() {
        return size.getArea() * costPerSqFt;
    }

    /**
     * Returns a string representation of the CarpetCost object.
     * @return A formatted string with room and cost details.
     */
    public String toString() {
        
        String str = size.toString() + "\n";
        
        
        str += String.format("The cost per sq ft is: $%.2f\n", costPerSqFt);
        str += String.format("The total cost is: $%,.2f", getCost());
        
        return str;
    }
}