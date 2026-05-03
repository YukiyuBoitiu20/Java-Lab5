import java.util.Scanner;

/**
 * Driver program to test RoomSize and CarpetCost aggregation.
 *  Citation: Watched YouTube video tutorials and video archives
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-05-03
 */
public class CarpetCostDemo {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        
        // USE CASE 1: Master Room 
        
        System.out.print("Enter Room Name: ");
        String name1 = keyboard.nextLine();

        System.out.print("Enter room length: ");
        double len1 = keyboard.nextDouble();

        System.out.print("Enter room width: ");
        double width1 = keyboard.nextDouble();

        System.out.print("Enter cost per square foot: ");
        double cost1 = keyboard.nextDouble();

        
        keyboard.nextLine();

       
        RoomSize temp = new RoomSize(name1, len1, width1);
        CarpetCost masterRoom = new CarpetCost(temp, cost1);

        System.out.println(masterRoom.toString());

        
        // USE CASE 2: Living Room
        
        System.out.print("\nEnter Room Name: ");
        String name2 = keyboard.nextLine();

        System.out.print("Enter room length: ");
        double len2 = keyboard.nextDouble();

        System.out.print("Enter room width: ");
        double width2 = keyboard.nextDouble();

        System.out.print("Enter cost per square foot: ");
        double cost2 = keyboard.nextDouble();

        
        CarpetCost livingRoom = new CarpetCost(new RoomSize(name2, len2, width2), cost2);

        System.out.println(livingRoom.toString());
        
        keyboard.close();
    }
}