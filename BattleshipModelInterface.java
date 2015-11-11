

/*
  @author Sam Cooledge
  @author Molly Allen
  @author Kellen Nealy
*/


//The order for the following methods is subject to  peer review and change

public interface BattleshipModelInterface {
  
}
  
  class Battleship {
    
    
  //fields:
  protected char[] grid;
  
  protected char row;
  
  protected int col;
  
  protected char hit;
  
  protected char miss;
  
  //method wil start a new game, setup and play shall follow
  public int NewGame(char row, int col){
    
    
    //a 10 by 10 grid represented by an array will be initialized char[100]
    //method body will include the beginning of a new game with the setup of a defensive grid
    //method will also create an offensive grid
  }
  
  /*method allows both users to place their battle ships
   * @param Dfence variable for char
   * */
  
  public char placeShips(char Dfence) {
  
  
}
  
  //legal setup checks if ships have been placed appropriately on grid
  //legal setup throws and catches exception...
  public void legalSetup() throws exception{
  
  }
  
  public void gameStart(){
  
  }
  
  public int playerMove(char row, int col);
  
  
  /*method will keep track of each board(defensive and offensive) and will update and return information
   * to each player
   * @param hit and miss will be variables represented
   * */
  public char gameState(char x, char o){
  
  }
  
  /*method will keep track of each turn whether it results in a hit or miss
   * @param hit will be char variable
   * @param miss will be char variable
   * */
  public int attackResponse(char hit , char miss){
    
   
  }
  
  /*determines whether move is legally defined or not
   * @throws illegalstateexception
   * */
  public void legalMove(){
    
  }
  
  public String turnsView(){
  }
  
  public void resetBoard(){
  }
  
  
  public int gameOver(){
  }
  
  }
  