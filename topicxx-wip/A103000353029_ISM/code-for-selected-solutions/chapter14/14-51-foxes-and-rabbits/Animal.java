import java.util.List;
import java.util.Random;

/**
 * Common elements of foxes and rabbits.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public abstract class Animal extends Actor
{
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();
    
    // Whether the animal is alive or not.
    private boolean alive;
    // The animal's position.
    private Location location;
    // The rabbit's age.
    private int age;

    /**
     * Constructor for objects of class Animal.
     * @param randomAge If true, the animal will have a random age.
     * @param location The animal's location.
     */
    public Animal(boolean randomAge, Location location)
    {
        this.alive = true;
        this.location = location;
        if(randomAge) {
            age = rand.nextInt(getMaxAge());
        }
        else {
            age = 0;
        }
    }
    
    /**
     * Whether the actor is still active.
     * @return true if they are active, false otherwise.
     */
    public boolean isActive()
    {
        return isAlive();
    }

    /**
     * Check whether or not this animal is to give birth at this step.
     * New births will be made into free adjacent locations.
     * @param freeLocations The locations that are free in the current field.
     */
    protected void giveBirth(Field nextFieldState, List<Location> freeLocations)
    {
        // New rabbits are born into adjacent locations.
        // Get a list of adjacent free locations.
        int births = breed();
        if(births > 0) {
            for (int b = 0; b < births && !freeLocations.isEmpty(); b++) {
                Location loc = freeLocations.remove(0);
                Animal young = createAnimal(false, loc);
                nextFieldState.placeActor(young, loc);
            }
        }
    }
    
    /**
     * Create a new animal.
     * @param randomAge If true, the animal will have a random age.
     * @param location The animal's location.
     */
    abstract protected Animal createAnimal(boolean randomAge, Location aLocation);


    /**
     * Generate a number representing the number of births,
     * if it can breed.
     * @return The number of births (may be zero).
     */
    private int breed()
    {
        int births;
        if(canBreed() && rand.nextDouble() <= getBreedingProbability()) {
            births = rand.nextInt(getMaxLitterSize()) + 1;
        }
        else {
            births = 0;
        }
        return births;
    }
    
    /**
     * Get the animal's breeding probability.
     * @return The breeding probability.
     */
    abstract protected double getBreedingProbability();
    
    /**
     * Get the animal's maximum litter size.
     * @return The maximum litter size.
     */
    abstract protected int getMaxLitterSize();
    
    /**
     * Check whether the animal is alive or not.
     * @return true if the animal is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }

    /**
     * Indicate that the animal is no longer alive.
     */
    protected void setDead()
    {
        alive = false;
        location = null;
    }
    
    /**
     * Return the animal's location.
     * @return The animal's location.
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Set the animal's location.
     * @param location The new location.
     */
    protected void setLocation(Location location)
    {
        this.location = location;
    }

    /**
     * Increase the age.
     * This could result in the rabbit's death.
     */
    protected void incrementAge()
    {
        age++;
        if(age > getMaxAge()) {
            setDead();
        }
    }
    
    /**
     * Get the animal's age.
     * @return age The animal's age.
     */
    protected int getAge()
    {
        return age;
    }
    
    /**
     * Set the animal's age.
     * @param age The animal's age.
     */
    protected void setAge(int age)
    {
        this.age = age;
    }

    /**
     * An animal can breed if it has reached the breeding age.
     */
    protected boolean canBreed()
    {
        return getAge() >= getBreedingAge();
    }
    
    /**
     * Get this animal’s breeding age.
     * @return The breeding age.
     */
    abstract protected int getBreedingAge();
    
    /**
     * Get the maximum age of the animal.
     * @return The maximum age.
     */
    abstract protected int getMaxAge();
}
