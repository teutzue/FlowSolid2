package Control;

import Entity.Engine;

public class Control implements WordPairControlInterface {

    Engine coreEngine;
    

    public Control() {

        coreEngine = new Engine();
    
    }

    /**
     * Pre: Post: A new word pair is added to the existing collection of word
     * pairs. This method does not save to file!
     */
    @Override
    public void add(String question, String answer) {
        coreEngine.add(question, answer);
        coreEngine.probability.add(5);
    }

    /**
     * Pre: Post: Returns the number of wordpairs in the collection (not the
     * file).
     */
    @Override
    public int size() {
        return coreEngine.size();
    }

    /**
     * Pre: At least one word pair must be present Post: Returns a question
     * randomly selected from the collection of word pairs.
     */
    @Override
    public String getRandomQuestion() {
        return coreEngine.getRandomQuestion();
    }

    /**
     * Pre: Post: Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false.
     *
     * @param question
     */
    @Override
    public boolean checkGuess(String question, String guess) {
        return coreEngine.checkGuess(question, guess);
    }

    /**
     * Pre: Post: Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     */
    @Override
    public String lookup(String question) {
        return coreEngine.lookUp(question);
    }

    /**
     * Pre: Post: Word pairs are read from the file "filename" and added to the
     * collection of word pairs. Returns true if successfully done. Otherwise it
     * returns false.
     */
    @Override
    public boolean load(String filename) {

        return coreEngine.load(filename);

    }

    /**
     * Pre: Post: All word pairs from the collection has been written to the
     * file "filename" Returns true if successfully done. Otherwise false.
     */
    @Override
    public boolean save(String filename) {

        return coreEngine.save(filename);

    }

    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    @Override
    public void clear() {
        coreEngine.clear();
    }
}
