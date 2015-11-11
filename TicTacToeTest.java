import org.junit.*;
import static org.junit.Assert.*;

/**
 * @Author: Sam Cooledge
 * HW 3: Testing
 * 
 * This is a skeleton for the third assignment.
 * Use this class to test the methods of TicTacToe, specifically
 * the overrides of the methods in TicTacToeBase.
 * 
 */
public class TicTacToeTest {
    
    // fields to hold the TicTacToe instances
    TicTacToe board1;
    TicTacToe board2;
    
    
    @Before
    // set up boards for testing
    public void setup() {
      
      board1 = new TicTacToe();
 
    }
   
    @Test
    // check to make sure that a brand-new game isn't done
    //in TicTacToeBase, count is initialized to 0, thus the game is not over because count < 5;
    public void newGameNotDone() {
      assertFalse("check new board, isGameOver", board1.isGameOver());
    }
    
     @Test
    //produces the same result as above, just another way of doing the same test
    //Uses assertEquals with param (false)
      public void newGameNotDone2() {  
        assertEquals( false, board1.isGameOver());
    }

    @Test
    public void newGameNotDone3() {
      board1.place('x',1);
      board1.place('o',2);
      //only two moves have been made, game is not over
      assertFalse("check new board, isGameOver", board1.isGameOver());
    }
    
    @Test 
    //test method to check game is actually done
    public void newGameIsDone(){
      //Uses place method to place x's and o's at various locations
      board1.place('x',1);
      board1.place('o',2);
      board1.place('x',4);
      board1.place('o',3);
      board1.place('x',7);
      board1.place('o',8);
      //more than 5 moves have been made, thus game is over
      assertTrue("game is over" , board1.isGameOver());
    }
      

    @Test
    //check legal moves
    public void Legal(){
      //isLegalMove is has a boolean return type, testing that 1 will result in a true for a legal move
      boolean result = board1.isLegalMove(1);
      assertTrue(result);
    }
    
    @Test
    //check legal moves
    public void Legal2(){
      //tests error case 
      boolean results = board1.isLegalMove(-3);
      assertFalse(results);
    }
    
    @Test
      public void Legal3() {
        //changed the TicTacToeBase to test for boundary case of 10
        //updated TicTacToeBase method isLegalMove to return square > 0 && square < 10
        boolean results = board1.isLegalMove(10);
        assertFalse(results);
    }

    @Test
    public void Winner() {
      //string method compares return string of "cat game"
      //tests to see if it has the same results as expected
      String sults = board1.getWinner();
      assertSame("cat game", sults);
    }
    
    @Test
      public void Winner2() {
        String sults = board1.getWinner();
        //error case tested,  "jk" is not same as "cat game"
        assertNotSame("jk", sults);
    }
    
    @Test
    //tests method place to see if it runs with anything inside of it
    public void PlaceTest(){
       board1.place('x',2);
}
    
    @Test
    public void TestToString() {
      //String method
      String resulting = board1.toString();
      //tests method to see if it has the same string output
      assertSame("   |   |   \n" +
            "---+---+---\n" +
            "   |   |   \n" + 
            "---+---+---\n" +
            "   |   |   \n" , resulting);
}
    
    @Test 
    public void TestToString2() {
      String resulting = board1.toString();
      //tests error case
      assertNotSame("   |   |   \n" + "happy all souls day" , resulting);
}
    
    @Test 
    public void TestResetBoard() { 
      //Tests false for reset board. 
       board1.place('x',1);
       //only one move has been made, thus game will not be over, thus board will not be reset unless method resetBoard() is called.
       board1.resetBoard();
       assertFalse("The board has not been reset", board1.isGameOver());
    }
}
