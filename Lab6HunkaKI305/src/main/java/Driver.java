/**
 * Driver class implements main method for Wardrobe class possibilities demonstration
 *
 * @author Adrian Hunka
 * @version 1.0
 */
public class Driver {

    public static void main(String[] args) {
        Wardrobe<? super Thing> wardrobe = new Wardrobe<Thing>();
        wardrobe.add(new Pants(150));
        wardrobe.add(new Shirt(80));
        wardrobe.add(new Pants(180));
        wardrobe.add(new Shirt());
        wardrobe.add(new Pants());
        wardrobe.add(new Shirt(50));
        wardrobe.weight();
        wardrobe.remove(0);
        wardrobe.weight();
        Thing thing = wardrobe.findMin();
        System.out.println("The lightest thing is: ");
        thing.print();
    }
}
