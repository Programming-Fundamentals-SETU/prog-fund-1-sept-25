import java.util.Observable;

/**
 * GameModel represents the model of the game.
 * 
 * @author Poul Henriksen
 * @version 7
 */
public class GameModel extends Observable
{
    private Room currentRoom;
    
    public GameModel()
    {
        createRooms();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room outside, theater, pub, lab, office;

        // create the rooms
        outside = new Room("outside the main entrance of the university");
        theater = new Room("in a lecture theater");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");

        // initialise room exits
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);

        theater.setExit("west", outside);

        pub.setExit("east", outside);

        lab.setExit("north", outside);
        lab.setExit("east", office);

        office.setExit("west", lab);

        currentRoom = outside; // start game outside
    }

    public Room getCurrentRoom()
    {
        return currentRoom;
    }

    public void goRoom(Room nextRoom)
    {
        currentRoom = nextRoom;
        setChanged();
        notifyObservers();
    }
    
    public String getWelcomeString() 
    {
        return "Welcome to the World of Zuul!" + "\n" + 
               "World of Zuul is a new, incredibly boring adventure game.";
    }
    
    public String getGoodByeString()
    {
        return "Thank you for playing.  Good bye.";
    }
    
    public String getHelpString()
    {
        return "You are lost. You are alone. You wander" + "\n" +
                "around at the university.";
    }
    
    public String getLocationInfo()
    {
        return "You are " + getCurrentRoom().getShortDescription() + "\n" +
                getCurrentRoom().getExitString();
    }
}
