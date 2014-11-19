
package Entity;

/**
 *
 * @author Costica Teodor Mihail && Aleksandar Terziev
 */
public class WordPair {
    
    public String question;
    public String answer;
    
    
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
