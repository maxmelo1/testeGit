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
 * @author IFMS
 */
public class TesteRaiany {
    
    public TesteRaiany() {
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

  public void testeSoma(){
    testegit.TesteGit teste = new TesteGit();
    assertEquals(5, teste.soma(4, 1));
    
}
}
