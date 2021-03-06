import org.junit.*;
import static org.junit.Assert.*;

/**
 * This is a skeleton for the third assignment.
 * Use this class to test the methods of TicTacToe, specifically
 * the overrides of the methods in TicTacToeBase.
 */
public class TicTacToeTest {
    
    // fields to hold the TicTacToe instances
    TicTacToe board1;
    
    @Before
    // set up boards for testing
    public void setup() {
        board1 = new TicTacToe();
     
    }
   
    @Test
    // check to make sure that a brand-new game isn't done
    public void newGameNotDone() {
        assertFalse("check new board, isGameOver", board1.isGameOver());
    }
    
    @Test
    //check legal moves
    public void Legal(){
      
        boolean result = board1.isLegalMove(1);
        
        //boolean results = board1.isLegalMove(-3);
        
        assertTrue("legal move maintained", result);
     
       // assertTrue("not legal move", results);
    }
    
    @Test
    //check legal moves
    public void Legal2(){
      
//        boolean result = board1.isLegalMove(1);
        
        boolean results = board1.isLegalMove(-3);
        
        assertFalse("not legal move", results);
     
       // assertTrue("not legal move", results);
    }
    
    @Test
    public void Winner() {
      
      String sults = board1.getWinner();
      
      assertEquals("cat game", sults);
    }
}
   
    
    

