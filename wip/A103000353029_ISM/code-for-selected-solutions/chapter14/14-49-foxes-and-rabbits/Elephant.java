import java.util.Iterator;
import java.util.List;

/**
 * A simple model of an elephant.
 * Elephants move and trample other animals.
 * They do not breed within the timescale of the simulation,
 * and they cannot die.
 * 
 * @author David J. Barnes and Michael Kölling and Poul Henricksen
 * @version 7.4
 */
public class Elephant extends Animal
{
    // Characteristics shared by all elephants (class variables).
    
    // The age at which an elephant can start to breed.
    private static final int BREEDING_AGE = 15;
    // The age to which an elephant can live.
    private static final int MAX_AGE = 10000;
    // The likelihood of an elephant breeding.
    private static final double BREEDING_PROBABILITY = 0;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 0;
    
    /**
     * Create a new elephant. An elephant may be created with age
     * zero (a new born) or with a random age.
     * 
     * @param randomAge If true, the elephant will have a random age.
     * @param location The location within the field.
     */
    public Elephant(boolean randomAge, Location location)
    {
        super(randomAge, location);
    }

    /**
     * This is what the elephant does most of the time: it wanders
     * the field trampling on other animals.
     * or die of old age.
     * @param currentField The field currently occupied.
     * @param nextFieldState The updated field.
     */
    public void act(Field currentField, Field nextFieldState)
    {
        incrementAge();
        if(isAlive()) {
            Location nextLocation = trample(currentField);
            // See if we trampled anything.
            if(nextLocation == null) { 
                // Nothing trampled - look elsewhere.
                List<Location> adjacent = currentField.getFreeAdjacentLocations(getLocation());
                if(! adjacent.isEmpty()) {
                    nextLocation = adjacent.get(0);
                }
            }
            // See if it was possible to move.
            if(nextLocation != null) {
                setLocation(nextLocation);
                nextFieldState.placeAnimal(this, nextLocation);
            }
            else {
                // Will have to wait patiently.
            }
        }
    }

    /**
     * Tell the elephant to trample non-elephants adjacent to its
     * current location.
     * @return One of the locations it has trampled into.
     */
    private Location trample(Field currentField)
    {
        List<Location> adjacent = currentField.getAdjacentLocations(getLocation());
        Iterator<Location> it = adjacent.iterator();
        Location trampled = null;
        while(it.hasNext()) {
            Location where = it.next();
            Animal anAnimal = currentField.getAnimalAt(where);
            // Don't trample other elephants.
            if(anAnimal != null && ! (anAnimal instanceof Elephant)) {
                if(anAnimal.isAlive()) { 
                    anAnimal.setDead();
                    trampled = where;
                }
            }
        }
        return trampled;
    }
    
    /**
     * Get this animal’s breeding age.
     * @return The breeding age.
     */
    protected int getBreedingAge()
    {
        return BREEDING_AGE;
    }
    
    /**
     * Get the maximum age of the animal.
     * @return The maximum age.
     */
    protected int getMaxAge()
    {
        return MAX_AGE;
    }
}
