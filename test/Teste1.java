/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testegit.TesteGit;

/**
 *
 * @author gabri
 */
public class Teste1 {
    
    public Teste1() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testaSoma() {
         testegit.TesteGit teste = new TesteGit();
         
         assertEquals(24, teste.mdc(24, 72));
     }
     
     @Test
     public void testaSoma2() {
         testegit.TesteGit teste = new TesteGit();
         
         assertEquals(3, teste.mdc(2, 8));
     }
}
