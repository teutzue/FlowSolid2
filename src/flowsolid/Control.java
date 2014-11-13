package flowsolid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control implements WordPairControlInterface {

    public static ArrayList<WordPair> wordList = new ArrayList();

    /**
     * Pre: Post: A new word pair is added to the existing collection of word
     * pairs. This method does not save to file!
     */
    @Override
    public void add(String question, String answer) {
        wordList.add(new WordPair(question, answer));
    }

    /**
     * Pre: Post: Returns the number of wordpairs in the collection (not the
     * file).
     */
    @Override
    public int size() {

        return wordList.size();
    }

    /**
     * Pre: At least one word pair must be present Post: Returns a question
     * randomly selected from the collection of word pairs.
     */
    @Override
    public String getRandomQuestion() {

        Random r = new Random();
        int number = r.nextInt(wordList.size());
        return wordList.get(number).getQuestion();
    }

    /**
     * Pre: Post: Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false.
     *
     * @param question
     */
    @Override
    public boolean checkGuess(String question, String guess) {
        String answer = null;
        for (WordPair item : wordList) {
            if (item.question.equalsIgnoreCase(question)) {
                answer = item.answer;
            }

        }
        if (guess.equalsIgnoreCase(answer)) {
            return true;
        } else {

            return false;
        }
        // return (guess.equalsIgnoreCase(answer)
    }

    /**
     * Pre: Post: Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     */
    @Override
    public String lookup(String question) {

        for (WordPair item : wordList) {
            if (item.question.equalsIgnoreCase(question)) {
                return item.answer;
            }

        }
        return null;
    }

    /**
     * Pre: Post: Word pairs are read from the file "filename" and added to the
     * collection of word pairs. Returns true if successfully done. Otherwise it
     * returns false.
     */
    @Override
    public boolean load(String filename) throws FileNotFoundException {
        try {

            File mini = new File(filename);
            Scanner scan = new Scanner(mini);
            scan.useDelimiter(",|\n");

            while (scan.hasNext()) {// as long there is still a next line 

                wordList.add(new WordPair(scan.next(), scan.next()));

            }

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * Pre: Post: All word pairs from the collection has been written to the
     * file "filename" Returns true if successfully done. Otherwise false.
     */
    @Override
    public boolean save(String filename) {

        try {

            File mini = new File(filename);
            FileWriter fWrite = new FileWriter(mini, true);
            for (WordPair item : wordList) {

                fWrite.append(item.question + "," + item.answer + "\n");

            }
            fWrite.close();// close acces to file 
            return true;

        } catch (IOException ex) {
            return false;
        }

    }

    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    @Override
    public void clear() {
        wordList.clear();
    }

}
