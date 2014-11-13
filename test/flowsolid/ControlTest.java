/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowsolid;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CosticaTeodor
 */
public class ControlTest {
    
    public ControlTest() {
    }

    /**
     * Test of add method, of class Control.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String question = "car";
        String answer = "bil";
        Control instance = new Control();
        instance.add(question, answer);
        assertEquals(instance.wordList.size(),1);
        
    }

    /**
     * Test of size method, of class Control.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Control instance = new Control();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getRandomQuestion method, of class Control.
     */
    @Test
    public void testGetRandomQuestion() {
        System.out.println("getRandomQuestion");
        Control instance = new Control();
        instance.add("car", "bil");
        String expResult = "";
        String result = instance.getRandomQuestion();
        System.out.println(result);
        assertTrue(expResult != result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkGuess method, of class Control.
     */
    @Test
    public void testCheckGuess() {
        System.out.println("checkGuess");
        String question = "";
        String quess = "";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.checkGuess(question, quess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookup method, of class Control.
     */
    @Test
    public void testLookup() {
        System.out.println("lookup");
        String question = "";
        Control instance = new Control();
        String expResult = "";
        String result = instance.lookup(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class Control.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        String filename = "";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.load(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Control.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String filename = "";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.save(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Control.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Control instance = new Control();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
