public class Hangman {
    // Instance variables
    GameManager manager;
    char[] solution;
    char[] currentWordState;
    char guess;
    int wrongGuessesCounter;
    boolean gameEnded;
    String[] imageNames = 
        {"0.png",
            "1.png",
            "2.png",
            "3.png",
            "4.png",
            "5.png",
            "6.png",
            "7.png",
            "8.png",
            "9.png",
            "10.png",
            "11.png"}; // The array imageNames[] is initialized with values here

    /**
     * Constructor for objects of class Hangman
     */
    public Hangman() {
        // Initialize instance variables

        manager = new GameManager();
        solution = manager.getRandomWord("WordList.txt");
        
        // TODO 2: Create currentWordState[]. (Note that it is already declared on line 6, but not created yet.) It should be as long as solution[].
        // TODO 2: Fill currentWordState[] with '_'.
        
        // TODO 2: Set gameEnded to the appropriate value.
        // TODO 2: Set wrongGuessesCounter to the appropriate value.

        // Set game window to start
        manager.writeWord(currentWordState);
        manager.showImage(imageNames[0]);

        // TODO 2: Call the play() method.
    }

    private void play() {
        while (!gameEnded) {
            guess = manager./*...*/; // TODO 3: The next guess of the player should be stored in the char variable guess.
                                     // (Use the documentation on the worksheet, where all methods available to manager are listed)
            
            /**↓ Check if guess is in solution[] and add it to currentWordState[] if necessary */
            // TODO 4: Declare the Boolean variable guessedCorrectlyThisTime with the value false. 
            // It will be used in each iteration to note whether the player guessed correctly with the guess or not.
    
            // TODO 4: Iterate over solution[] (with a fixed-count loop) and check for each element if it contains the same character as guess.
            // If it does, store the character at the same position in currentWordState[] and set guessedCorrectlyThisTime to true.
            /**↑ Check if guess is in solution[] and add it to currentWordState[] if necessary */
            
            // TODO 4: manager should display currentWordState[] in the window.
    
            /**↓ Update game state (next image, lost?, won?)*/
    
            /**↓ If guessed incorrectly, check if lost and update image */
            if (...){ // TODO 5: If not guessed correctly this time (you set the variable in TODO 4)
                // TODO 5: Increment the variable that notes how many times the player has guessed incorrectly by one.
                manager./*...*/; // TODO 5: Then manager should display the next image.
                                 // The relative file paths (or in our case the file names) are managed in imageNames[].
                                 // The documentation on the worksheet might help.
                
                // TODO 5: If the player has guessed incorrectly as many times as there are images (length of imageNames[]), set gameEnded to true.
            }
            /**↑ If guessed incorrectly, check if game is lost and update image */
    
            /**↓ Check if won */
            
            // TODO 6: Check if there are letters that have not yet been guessed.
            // Create a Boolean variable containsGap.
            // For each element of currentWordState[], if it is a gap ('_'), set containsGap to true.
            
            // TODO 6: If there was no gap (containsGap == false), the player has won, and the game should end.
            // Also, the image with the relative file path "won.png" should be displayed.
            /**↑ Check if won */
    
            /**↑ Update game state (next image, lost?, won?)*/
        }
    }
}