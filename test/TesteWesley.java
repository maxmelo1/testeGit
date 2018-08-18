
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testegit.TesteGit;

/**
 *
 * @author Wesley
 */
public class TesteWesley {
    
    public TesteWesley() {
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
    
    @Test
    public void Somatoria (){
        
        testegit.TesteGit testando = new TesteGit();
        
        assertEquals(5, testando.soma(4, 1));
        
    }
}
