/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class PetFactoryTest {
    
    public PetFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPet method, of class PetFactory.
     */
    @Test
    public void testGetPet() {
        System.out.println("getPet function call Test 1");
        String petType = "Bow";
        PetFactory instance = new PetFactory();
        String expResult = "Bow Wow";
        Pet result = instance.getPet(petType);
        assertEquals(expResult, result.petSound());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPet2() {
        System.out.println("getPet function call Test 2");
        String petType = "Meow";
        PetFactory instance = new PetFactory();
        String expResult = "Meow Meow";
        Pet result = instance.getPet(petType);
        assertEquals(expResult, result.petSound());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
