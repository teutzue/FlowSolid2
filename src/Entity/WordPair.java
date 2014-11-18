
package Entity;

/**
 *
 * @author CosticaTeodor
 */
public class WordPair {
    public String question;
    public String answer;
    //public int priority;
    
    public WordPair(String question, String answer){
    
    this.question = question;
    this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
