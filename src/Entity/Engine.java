package Entity;

import static Control.Control.wordList;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author CosticaTeodor
 */
public class Engine {

    public static ArrayList<Integer> probability = new ArrayList<>();

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

}
