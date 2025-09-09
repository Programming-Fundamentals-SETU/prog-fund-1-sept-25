import java.util.Random;

/**
 * Common elements of foxes and rabbits.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public abstract class Animal
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
     * @param randomAge If true, the rabbit will have a random age.
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
     * Act.
     * @param currentField The current state of the field.
     * @param nextFieldState The new state being built.
     */
    abstract public void act(Field currentField, Field nextFieldState);
    
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
