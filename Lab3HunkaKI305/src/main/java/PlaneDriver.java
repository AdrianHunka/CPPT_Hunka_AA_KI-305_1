public class PlaneDriver {

    public static void main(String[] args) {
        BomberPlane plane1 = new BomberPlane("F-16", "Jet", 10000, 2, "Adrian",
                "Hunka", 100, "UA", "Lviv", "Kharkiv Aviation Plant", 4);

        BomberPlane plane2 = new BomberPlane("B-52", "Propeller", 20000, 6, "John",
                "Doe", 50, "US", "California", "Boeing Plant", 8);

        BomberPlane plane3 = new BomberPlane("Su-34", "Jet", 12000, 3, "Ivan",
                "", 75, "RU", "Warsaw", "Sukhoi Plant", 6);

        plane1.displayInfo();
        plane1.takeOff();
        plane1.dropBombs();
        plane1.dropBombs();
        plane1.dropBombs();
        plane1.dropBombs();
        plane1.dropBombs();
        plane1.land();

        plane2.displayInfo();
        plane2.takeOff();
        plane2.dropBombs();
        plane2.dropBombs();
        plane2.land();

        plane3.displayInfo();
        plane3.takeOff();
        plane3.dropBombs();
        plane3.land();

        // Count the number of objects created
        System.out.println("Кількість створених об'єктів: " + Plane.getObjectCount());
    }
}
