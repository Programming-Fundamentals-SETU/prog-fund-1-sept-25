import java.io.*;
import java.util.*;

/**
 * A class to reading responses from files.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 7
 */
public class ResponseReader
{
    // The name of the file containing the default responses.
    private static final String FILE_OF_DEFAULT_RESPONSES = "default.txt";
    // The name of the file containing the responses with associations.
    private static final String FILE_OF_MAIN_RESPONSES = "responses.txt";

    /**
     * Create a ResponseReader
     */
    public ResponseReader()
    {
    }
    
    /**
     * Read a list of default responses from which we can pick
     * if we don't know what else to say.
     * @return The list of responses.
     */
    public List<String> readDefaultResponses()
    {
        String filename = FILE_OF_DEFAULT_RESPONSES;
        List<String> defaultResponses = new ArrayList<>();
        
        try {
            BufferedReader reader = 
                new BufferedReader(new FileReader(filename));
            String response = reader.readLine();
            while(response != null) {
                defaultResponses.add(response);
                response = reader.readLine();
            }
            reader.close();
        }
        catch(FileNotFoundException e) {
            System.err.println("Unable to open " + filename);
        }
        catch(IOException e) {
            System.err.println("A problem was encountered reading " +
                               filename);
        }
        // Make sure we have at least one response.
        if(defaultResponses.size() == 0) {
            defaultResponses.add("Could you elaborate on that?");
        }
        return defaultResponses;
    }

    /**
     * Read a map of String pairs from a file and return them.
     * 
     * The key and value are assumed to be on alternate lines; e.g.:
     *     computer
     *     Does your computer keep crashing
     *     memory
     *     You should upgrade the memory
     *     
     * The map will be empty if the file was not found.
     * @return A map of key/response pairs.
     */
    public Map<String, String> readMainResponses()
    {
        String filename = FILE_OF_MAIN_RESPONSES;
        HashMap<String, String> map = new HashMap<>();
        try {
            BufferedReader reader =
                new BufferedReader(new FileReader(filename));
            String word;
            word = reader.readLine();
            while(word != null) {
                String response = reader.readLine();
                if(response != null) {
                    response = response.trim();
                    if(response.length() != 0) {
                        map.put(word, response);
                    }
                    else {
                        System.out.println("Blank response for " +
                                           word + " in file " +
                                           filename);
                    }
                }
                else {
                    System.out.println("Missing response for " +
                                       word + " in file " +
                                       filename);
                }
                word = reader.readLine();
            }
            reader.close();
        }
        catch(IOException e) {
            System.out.println("Problem reading file: " + filename +
                               " in readMap");
        }
        return map;
    }

    /**
     * Write a map of strings to a file.
     * NB: Any previous contents of filename will be overwritten.
     * @param map The map to be written.
     * @param filename The file to write.
     */
    public void writeMap(HashMap<String, String> map, String filename)
    {
        if(map != null) {
            try {
                FileWriter writer = new FileWriter(filename);
                for(String key : map.keySet()) {
                    String value = map.get(key);
                    if(value != null) {
                        writer.write(key.trim());
                        writer.write('\n');
                        writer.write(value.trim());
                        writer.write('\n');
                    }
                    else {
                        System.out.println("Null response for " +
                                           key + " in writeFile.");
                    }
                }                    
                writer.close();
            }
            catch(IOException e) {
                System.out.println("Problem writing file: " + filename +
                                   " in writeList");
            }
        }
        else {
            System.out.println("Null map passed to writeList.");
        }
    }

}
