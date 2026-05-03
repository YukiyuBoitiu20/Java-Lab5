/**
 * Represents the dimensions of a room.
 * Citation: Watched YouTube video tutorials and video archives
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-05-03
 */
public class RoomSize {
    private String name;
    private double length;
    private double width;

    /**
     * Constructor
     * @param inName The name of the room.
     * @param inLen The length of the room.
     * @param inWidth The width of the room.
     */
    public RoomSize(String inName, double inLen, double inWidth) {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    /**
     * Copy Constructor (Safe object copy for aggregation)
     * @param object2 The RoomSize object to copy.
     */
    public RoomSize(RoomSize object2) {
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    /**
     * Calculates the area of the room.
     * @return The area (length * width) as a double.
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Returns a string representation of the RoomSize object.
     * @return A formatted string with room details.
     */
    public String toString() {
        return "Room Name: " + name + "\nLength: " + length + "\nWidth: " + width + "\nArea: " + getArea();
    }
}