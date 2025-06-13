import java.util.List;

/**
 * A Scientist monitors the health of the animals
 * in the field.
 */
public class Scientist implements Actor
{
    // The scientist's position.
    private Location location;
    
    /**
     * Constructor for objects of class Scientist.
     * @param location The initial location.
     */
    public Scientist(Location location)
    {
        this.location = location;
    }
    
    /**
     * Perform an action in the state of the currentField,
     * leading to an updated state in nextFieldState.
     * @param currentField The current state of the field.
     * @param nextFieldState The new state being built.
     */
    public void act(Field currentField, Field nextFieldState)
    {
        List<Location> adjacent = currentField.getAdjacentLocations(location);
        for(Location aLocation : adjacent) {
            Actor anActor = currentField.getActorAt(aLocation);
            if(anActor instanceof Animal anAnimal) {
                // Remove from the field for a health check.
                // Do this by marking the animal as no longer active, which
                // has to be done by artificially marking it as dead.
                anAnimal.setDead();
            }
        }
        location = nextFieldState.getRandomLocation();
        nextFieldState.placeActor(this, location);
    }
    
    /**
     * Whether the actor is still active.
     * @return true if they are active, false otherwise.
     */
    public boolean isActive()
    {
        return true;
    }
}
