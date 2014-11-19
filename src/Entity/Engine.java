package Entity;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Costica Teodor Mihail && Aleksandar Terziev
 * 
 */
public class Engine {

    FileHandler fileHandler;
    public ArrayList<Integer> probability;
    ArrayList<WordPair> wordList;

    public Engine() {

        fileHandler = new FileHandler();
        probability = new ArrayList<>();
        wordList = new ArrayList();
        load("filename");
        
    }

    public boolean checkGuess(String question, String guess) {

        String answer = null;
        int count = 0;

        for (WordPair item : wordList) {

            if (item.question.equalsIgnoreCase(question)) {
                answer = item.answer;
                break;
            }
            count++;

        }

        if (guess.equalsIgnoreCase(answer)) {
            //System.out.println(probability.get(count));
            probability.set(count, probability.get(count) - 1);
            return true;

        } else {
            probability.set(count, probability.get(count) + 1);
            return false;
        }
//        return guess.equalsIgnoreCase(answer);
    }

    public String lookUp(String question) {

        for (WordPair item : wordList) {
            if (item.question.equalsIgnoreCase(question)) {
                return item.answer;
            }

        }
        return null;

    }

    public String getRandomQuestion() {

        int number = new Random().nextInt(wordList.size());

        int num = new Random().nextInt(10) + 1;

        System.out.println(num);
        System.out.println(probability);
        System.out.println("============");
        if (num >= probability.get(number)) {

            return getRandomQuestion();

        } else {

            return wordList.get(number).getQuestion();

        }

    }

    public int size() {

        return wordList.size();

    }

    public void add(String question, String answer) {

        wordList.add(new WordPair(question, answer));
    }

    public void clear() {

        wordList.clear();
    }

    public boolean load(String filename) {

        return fileHandler.load(filename, wordList, probability);

    }

    public boolean save(String filename) {

        return fileHandler.save(filename, wordList, probability);

    }

}
