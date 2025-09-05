import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.CountDownLatch;

public class GameManager {
    private LinkedBlockingQueue<char[]> guessedWords;
    GameDisplay hangman;    

    public GameManager() {
        CountDownLatch latch = new CountDownLatch(1);
        guessedWords = new LinkedBlockingQueue<>();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                hangman = new GameDisplay(latch, guessedWords);

                JOptionPane optionPane = new JOptionPane();                    
                optionPane.showMessageDialog(null, hangman, "Hangman", JOptionPane.PLAIN_MESSAGE);

                if (optionPane.OK_OPTION == 0) {
                    System.exit(0);
                }    
            }
        });
        try {
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();
        } // Ensures the game display is ready before proceeding to avoid null pointer exceptions
    }

    /**
     * @param word is a char[] array to be displayed as text.
     */
    public void writeWord(char[] word) {
        hangman.writeWord(word);
    } // forward

    /**
     * @param number is an int to be displayed in the window.
     */
    public void writeNumber(int number) {
        hangman.writeNumber(number);
    } // forward

    /**
     * @param filepath is the relative file path of an image to be displayed.
     */
    public void showImage(String filepath) {
        hangman.showImage(filepath);
    } // forward

    /**
     * @return char[] that the user has entered in the text field. Waits until something new is entered.
     */
    public char[] getNextGuessWord() {
        return hangman.getNextGuessWord();
    } // forward

    /**
     * @return char the first letter the user has entered in the text field. Waits until something new is entered.
     */
    public char getNextGuessChar() {
        return hangman.getNextGuessChar();
    } // forward

    /**
     * @param filename e.g., "WordList.txt"
     * @return String[] - many words from a file
     */
    public String[] getWordList(String filename) {
        ArrayList<String> words = new ArrayList<>();
        try {
            File file = new File(filename);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("An error occurred when opening or processing WordList.txt!");
            e.printStackTrace();
            return new String[]{"Fallback", "Problem"};
        }
        return words.toArray(new String[0]);
    }

    /**
     * @param filename e.g., "WordList.txt"
     * @return a random word as char[]
     */
    public char[] getRandomWord(String filename) {
        String[] wordList = getWordList(filename);
        return wordList[(int)(Math.random() * wordList.length)].toCharArray();
    }

    public class GameDisplay extends JPanel implements ActionListener {
        private JTextField textField;
        private JLabel label;
        private JLabel comment;
        private JLabel image;
        private Font font;
        private LinkedBlockingQueue<char[]> guessedWordsQueue;

        public GameDisplay(CountDownLatch latch, LinkedBlockingQueue<char[]> guessedWordsQueue) {
            this.guessedWordsQueue = guessedWordsQueue;
            font = new Font("Monospaced", Font.PLAIN, 20);
            setFont(font);
            Box outerBox = Box.createVerticalBox();
            add(outerBox);
            Box innerBox = Box.createHorizontalBox();
            outerBox.add(innerBox);

            innerBox.add(new JLabel("Guess letter or word: "));
            textField = new JTextField(10);
            innerBox.add(textField);

            label = new JLabel("");
            label.setFont(font);
            outerBox.add(label);

            image = new JLabel();
            image.setMaximumSize(new Dimension(900, 700));
            outerBox.add(image);

            comment = new JLabel("");
            outerBox.add(comment);

            textField.addActionListener(this);
            validate();
            setPreferredSize(new Dimension(1000, 700));

            textField.setText("");
            repaint();
            latch.countDown();
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(textField)) {
                String s = textField.getText();
                try {
                    if (s.length() > 0) guessedWordsQueue.put(s.toCharArray());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                textField.setText("");
                repaint();
            }
        }

        /**
         * @param word is the text to be displayed
         */
        public void writeWord(char[] word) {
            if (word.length == 0) {
                label.setText("");
                repaint();
                return;
            }
            char[] result = new char[word.length * 2];
            for (int i = 0; i < word.length; i++) {
                result[i * 2] = word[i];
                result[i * 2 + 1] = ' ';
            }
            label.setText(new String(result));
            repaint();
        }

        public void writeNumber(int number) {
            comment.setText(String.valueOf(number));
            repaint();
        }

        /**
         * @param filepath is the relative file path of an image to be displayed.
         */
        public void showImage(String filepath) {
            try {
                image.setIcon(new ImageIcon(getClass().getResource(filepath)));
                repaint();
            } catch (Exception ex) {
                System.err.println("File " + filepath + " could not be loaded");
            }
        }

        /**
         * @return char[] that the user has entered in the text field. Waits until something new is entered.
         */
        public char[] getNextGuessWord() {
            try {
                return guessedWordsQueue.take();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return null;
        }

        /**
         * @return char the first letter the user has entered in the text field. Waits until something new is entered.
         */
        public char getNextGuessChar() {
            try {
                return guessedWordsQueue.take()[0];
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return '!';
        }
    }
}