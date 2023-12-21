/**
 * Interface Thing describes rules for thing type
 *
 * @author Adrian Hunka
 * @version 1.0
 */
interface Thing {

    /**
     * Method prints info about thing
     */
    public void print();

    /**
     * Method returns thing's weight
     */
    public int getWeight();

    /**
     * Method compares current Thing with another Thing
     *
     */
    public int compareTo(Thing d);
}
