
package Entity;

import static Control.Control.wordList;
import static Entity.Engine.probability;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author CosticaTeodor
 */
public class FileHandler {
    
    
    
    public boolean load(String filename) {
        try {

            File mini = new File(filename);
            Scanner scan = new Scanner(mini);
            scan.useDelimiter(",|\n");

            while (scan.hasNext()) {// as long there is still a next line 

                wordList.add(new WordPair(scan.next(), scan.next()));
                probability.add(5);
                

            }

            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
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


}
