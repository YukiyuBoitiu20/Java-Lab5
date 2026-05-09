/**
 * Driver class to test the HR system and Polymorphism.
 * CITATION:Watched Ch10 video archives,recaps Zoom Ch10 and
 * Java tutorials on YouTube.
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-05-08
 */
public class HRDemo {
    public static void main(String[] args) {
        // Steps 1 & 2
        FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);
        Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);
        // Steps 3 to 7
        FullTime wilma = new FullTime();
        wilma.setName("Flintstone, Wilma");
        wilma.setIdNum("BR-3");
        wilma.setHireYear(2016);
        wilma.setSalary(78123.2468);
        // Steps 8 & 9
        Employee betty = new Employee("Rubble, Betty", 2020, "BR-4");
        FullTime wilma2 = new FullTime("Slate, Wilma", 2016, "BR-3", 78123.2468);
        // Step 10
        Person[] staff = {fred, barney, wilma, betty, wilma2};
        // Step 11
        for (int i = 0; i < staff.length; i++) {
            System.out.println("Employee" + (i + 1));
            System.out.println(staff[i] + "\n");
        }
        // Step 12
        System.out.println("wilma and wilma2 are the same person: " + wilma.equals(wilma2) + "\n");
        // Step 13
        wilma.setName("Slate, Wilma");
        // Step 14
        Person[] staff2 = {fred, barney, wilma, betty};
        // Step 15
        for (int i = 0; i < staff2.length; i++) {
            System.out.println("Employee" + (i + 1));
            System.out.println(staff2[i] + "\n");
        }
    }
}