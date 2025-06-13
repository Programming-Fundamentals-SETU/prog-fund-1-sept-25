/**
 * An actor in a simulation.
 * @author David J. Barnes and Michael Kölling
 * @Version 7.5
 */
public abstract class Actor
{
    /**
     * Perform an action in the state of the currentField,
     * leading to an updated state in nextFieldState.
     * @param currentField The current state of the field.
     * @param nextFieldState The new state being built.
     */
    abstract public void act(Field currentField, Field nextFieldState);
    
    /**
     * Whether the actor is still active.
     * @return true if they are active, false otherwise.
     */
    abstract public boolean isActive();
}
