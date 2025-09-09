import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and
 * tries to interpret the line as a two word command. It returns the command
 * as an object of class Command.
 * 
 * The parser records a log of the game that can be saved.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7
 */
public class Parser 
{
    private CommandWords commands;  // holds all valid command words
    private Scanner reader;         // source of command input
     // A log of all commands read.
    private List<String> commandLog;
    // Where to write the game log.
    private static String DEFAULT_LOGFILE = "zuul_log.txt";

    /**
     * Create a parser to read from the terminal window.
     */
    public Parser() 
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
        commandLog = new LinkedList<>();
    }

    /**
     * @return The next command from the user.
     */
    public Command getCommand() 
    {
        String inputLine;   // will hold the full input line
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // print prompt

        inputLine = reader.nextLine();
        log(inputLine);

        // Find up to two words on the line.
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // get first word
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // get second word
                // note: we just ignore the rest of the input line.
            }
        }

        // Now check whether this word is known. If so, create a command
        // with it. If not, create a "null" command (for unknown command).
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2); 
        }
    }

    /**
     * Print out a list of valid command words.
     */
    public void showCommands()
    {
        commands.showAll();
    }
    
    /**
     * Save a log of the game.
     * @return true if successful, false otherwise.
     */
    public boolean saveGameLog()
    {
        return saveGameLog(DEFAULT_LOGFILE);
    }
    
    /**
     * Save a log of the game to the given file name.
     * @param filename Where to save the log.
     * @return true if successful, false otherwise.
     */
    public boolean saveGameLog(String filename)
    {
        boolean success = true;
        try {
            FileWriter log = new FileWriter(filename);
            for(String inputLine : commandLog) {
                log.write(inputLine);
                log.write('\n');
            }
            log.close();
        }
        catch(IOException e) {
            // We could report the reason for failure here.
            success = false;
        }
        return success;        
    }
    
    private void log(String inputLine)
    {
        commandLog.add(inputLine);
    }
    
}
