public class Hangman_Solution {
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
            "11.png"};

    /**
     * Constructor for objects of class Hangman_Solution
     */
    public Hangman_Solution() {
        // Initialize instance variables

        manager = new GameManager();
        solution = manager.getRandomWord("WordList.txt");
        currentWordState = new char[solution.length];
        for (int i = 0; i < currentWordState.length; i++) { // fill currentWordState with '_'
            currentWordState[i] = '_';
        }

        // Set game window to start
        manager.writeWord(currentWordState);
        manager.showImage(imageNames[0]);

        gameEnded = false;
        wrongGuessesCounter = 0;

        play();
    }

    private void play() {
        while (!gameEnded) {
            guess = manager.getNextGuessChar();

            /**↓ Check if guess is in solution[] and update currentWordState[] if necessary */
            boolean guessedCorrectlyThisTime = false;

            for (int i = 0; i < currentWordState.length; i++) {
                if (solution[i] == guess) {
                    currentWordState[i] = solution[i];
                    guessedCorrectlyThisTime = true;
                }
            }
            /**↑ Check if guess is in solution[] and update currentWordState[] if necessary */

            manager.writeWord(currentWordState);

            /**↓ Update game state (next image, lost?, won?) */
    
            /**↓ If guessed incorrectly, check if lost and update image */
            if (!guessedCorrectlyThisTime) { // check if guessed incorrectly
                wrongGuessesCounter++;
                manager.showImage(imageNames[wrongGuessesCounter]);
                if (wrongGuessesCounter >= imageNames.length - 1) {
                    gameEnded = true;
                }
            }
            /**↑ If guessed incorrectly, check if lost and update image */
    
            /**↓ Check if won */
            boolean containsGaps = false;
            for (int i = 0; i < currentWordState.length; i++) { // check if there are still letters that haven't been guessed
                if (currentWordState[i] == '_') {
                    containsGaps = true;
                }
            }
            if (!containsGaps) { // check if won
                manager.showImage("won.png");
                gameEnded = true;
            }
            /**↑ Check if won */
    
            /**↑ Update game state (next image, lost?, won?) */
        }
    }

    private boolean isEqual(char c1, char c2) {
        return Character.toLowerCase(c1) == Character.toLowerCase(c2);
    }
}