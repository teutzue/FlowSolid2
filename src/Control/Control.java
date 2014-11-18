package Control;

//import Entity.DisplayAnswer;
import Entity.WordPair;
import Entity.FileHandler;
import java.util.ArrayList;
import java.util.Random;

public class Control implements WordPairControlInterface {
    
    //DisplayAnswer disp;
    FileHandler fh;
    public static ArrayList<WordPair> wordList;

    public Control() {

        fh = new FileHandler();
        //disp = new DisplayAnswer();
        wordList = new ArrayList();

    }

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

        //Random r = new Random();
        int number = new Random().nextInt(wordList.size());
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
         //return guess.equalsIgnoreCase(answer);
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
    public boolean load(String filename) {

        return fh.load(filename, wordList);

    }

    /**
     * Pre: Post: All word pairs from the collection has been written to the
     * file "filename" Returns true if successfully done. Otherwise false.
     */
    @Override
    public boolean save(String filename) {

        return fh.save(filename, wordList);

    }

    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    @Override
    public void clear() {
        wordList.clear();
    }
}
