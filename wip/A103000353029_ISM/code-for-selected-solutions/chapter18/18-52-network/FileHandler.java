import java.io.*;

/**
 * Handle saving and reading of news feeds.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 7
 */
public class FileHandler
{    
    /**
     * Constructor for objects of class FileHandler
     */
    public FileHandler()
    {
    }

    /**
     * Read the binary version of a news feed from the given file.
     * @param sourceFile The file from where the details are to be read.
     * @return The news feed object.
     * @throws IOException If the reading process fails for any reason.
     */
    public NewsFeed readFromFile(String sourceFile)
        throws IOException, ClassNotFoundException
               
    {
        try {
            ObjectInputStream is = new ObjectInputStream(
                                    new FileInputStream(sourceFile));
            NewsFeed feed = (NewsFeed) is.readObject();
            is.close();
            return feed;
        }
        catch(InvalidClassException e) {
            System.out.println(e);
            return null;
        }
        catch(IOException e) {
            throw new IOException("Unable to read a feed from " +
                                  sourceFile);
        }
    }
    
    /**
     * Save a binary version of the news feed to the given file.
     * @param feed The news feed to be saved.
     * @param destinationFile The file where the details are to be saved.
     * @throws IOException If the saving process fails for any reason.
     */
    public void saveToFile(NewsFeed feed, String destinationFile)
        throws IOException
    {
        ObjectOutputStream os = new ObjectOutputStream(
                                    new FileOutputStream(destinationFile));
        os.writeObject(feed);
        os.close();
    }
    
}
