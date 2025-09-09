import java.util.List;
import java.util.Random;

/**
 * A simple model of a rabbit.
 * Rabbits age, move, breed, and die.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.1
 */
public class Rabbit extends Animal
{
    // Characteristics shared by all rabbits (class variables).
    // The age at which a rabbit can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a rabbit can live.
    private static final int MAX_AGE = 40;
    // The likelihood of a rabbit breeding.
    private static final double BREEDING_PROBABILITY = 0.12;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 4;
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();

    /**
     * Create a new rabbit. A rabbit may be created with age
     * zero (a new born) or with a random age.
     * 
     * @param randomAge If true, the rabbit will have a random age.
     * @param location The location within the field.
     */
    public Rabbit(boolean randomAge, Location location)
    {
        super(randomAge, location);
    }

    /**
     * This is what the rabbit does most of the time - it runs 
     * around. Sometimes it will breed or die of old age.
     * @param currentField The field occupied.
     * @param nextFieldState The updated field.
     */
    public void act(Field currentField, Field nextFieldState)
    {
        incrementAge();
        if(isAlive()) {
            List<Location> freeLocations = 
                nextFieldState.getFreeAdjacentLocations(getLocation());
            if(!freeLocations.isEmpty()) {
                giveBirth(nextFieldState, freeLocations);
            }
            // Try to move into a free location.
            if(! freeLocations.isEmpty()) {
                Location nextLocation = freeLocations.get(0);
                setLocation(nextLocation);
                nextFieldState.placeAnimal(this, nextLocation);
            }
            else {
                // Overcrowding.
                setDead();
            }
        }
    }

    @Override
    public String toString() {
        return "Rabbit{" +
        "age=" + getAge() +
        ", alive=" + isAlive() +
        ", location=" + getLocation() +
        '}';
    }
    
    /**
     * Create a new animal.
     * @param randomAge If true, the animal will have a random age.
     * @param location The animal's location.
     */
    protected Animal createAnimal(boolean randomAge, Location aLocation)
    {
        return new Rabbit(randomAge, aLocation);
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
    
    /**
     * Get the animal's breeding probability.
     * @return The breeding probability.
     */
    protected double getBreedingProbability()
    {
        return BREEDING_PROBABILITY;
    }
    
    /**
     * Get the animal's maximum litter size.
     * @return The maximum litter size.
     */
    protected int getMaxLitterSize()
    {
        return MAX_LITTER_SIZE;
    }
}
