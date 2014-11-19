
package Entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Costica Teodor Mihail && Aleksandar Terziev
 */
public class FileHandler {
    
    
    
    public boolean load(String filename, ArrayList<WordPair>  incomingArray , ArrayList<Integer> probability   ) {
        try {

            File mini = new File(filename);
            Scanner scan = new Scanner(mini);
            scan.useDelimiter(",|\n");

            while (scan.hasNext()) {// as long there is still a next line 

                incomingArray.add(new WordPair(scan.next(), scan.next()));
                probability.add(5);
                

            }

            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
     public boolean save(String filename,ArrayList<WordPair>  incomingArray, ArrayList<Integer> probability) {

        try {

            File mini = new File(filename);
            FileWriter fWrite = new FileWriter(mini, true);
            for (WordPair item : incomingArray) {

                fWrite.append(item.question + "," + item.answer + "\n");

            }
            fWrite.close();// close acces to file 
            return true;

        } catch (IOException ex) {
            return false;
        }

    }


}
