public class tictactoe extends NscWindow implements java.awt.event.ActionListener {
  
 private int CENTER;
  
  private javax.swing.JLabel label = new javax.swing.JLabel("X's turn");
    
  private javax.swing.JButton[][] buttons = new javax.swing.JButton[10][10];
    
  private int counter = 1;
 
  private NscWindow win;
  
  
  public tictactoe() {
    super(10,10,235,280);
    
    
    label = new javax.swing.JLabel("X's turn");
    
    this.setTitle("TicTacToe");
    
    NscRectangle backgroundColor = new NscRectangle(30,30,160,160);
        
    backgroundColor.setFilled(true);
        
    java.awt.Color newCol = new java.awt.Color(255,255,0);
        
    backgroundColor.setBackground(newCol);
    
    this.add(backgroundColor);
    
    this.repaint();
    
    this.myLabel();
    
    this.myBoard();
    
    
 }

  
    public void myLabel() {
      
      label.setSize(160,20);
      
      label.setLocation(30,200);
     
      label.setHorizontalAlignment(CENTER);
      
      this.add(label);
      
      this.repaint();
             
    }
    
     public void myBoard(){
    
        //set x and y to beginning postions 
        int x = 30;
    
        int y = 30;
        
        int i = 1;
        
        for ( int col = 0 ; col < 3 ; col++){
            for ( int row = 0 ; row < 3 ; row++) {
                
                buttons[col][row] = new javax.swing.JButton();
                //set size to 50,50; 
                buttons[col][row].setSize(50,50);
                
                buttons[col][row].setLocation(x,y);
                
                buttons[col][row].setActionCommand("square" + i);
                
                buttons[col][row].addActionListener(this);
                
                this.add(buttons[col][row]);
                //shift y coordinate 55
                y += 55;
                
                i++;
            }
            //y stays at 30
            y = 30;
            
            //x moves 50(for size) plus another 5 for space
            x += 55;
            
        }
    
     }
    
    
  public void actionPerformed(java.awt.event.ActionEvent e){
      
        System.out.println(counter);
        //call on action command 
        if(e.getActionCommand().equals("square1")){
           //not even, O's turn 
            if(counter % 2 != 0) { 
                
                label.setText("O's turn");
                //marks first sqaure with x
                buttons[0][0].setText("X");
            }
            // even
            else if (counter % 2 == 0) {
               
                label.setText("X's turn");
                //still in first row, marks O
                buttons[0][0].setText("O");
                
            }
            //boolean statement for each for each set
            buttons[0][0].setEnabled(false);
            //counter updated to see whose turn it is
            counter += 1;
        }
           else if(e.getActionCommand().equals("square2")) {
               if (counter % 2 != 0)
               { label.setText("O's turn");
                   
                   buttons[0][1].setText("X");
                   
               } else if (counter % 2 == 0) 
               { label.setText("X's turn");
                
                   buttons[0][1].setText("O");}
                   buttons[0][1].setEnabled(false);
                   
                   counter +=1;
                   
               } else if (e.getActionCommand().equals("square3")) { 
                   if (counter % 2 != 0 ) { 
                       
                       label.setText("O's turn");
                       
                       buttons[0][2].setText("X");
                   } else if ( counter  % 2 == 0 ) {
                       label.setText("X's turn");
                       
                       buttons[0][2].setText("O");}
                       
                       buttons[0][2].setEnabled(false);
                       
                       counter += 2;
                       
                   }
                   
                   
               else if (e.getActionCommand().equals("square4")) {
                   
                   if(counter % 2 != 0) {
                       
                       label.setText("O's turn");
                       
                       buttons[1][0].setText("X");
                       
                   }
                   
                   else if (counter % 2 == 0) { 
                       
                       label.setText("X's turn");
                       
                       buttons[1][0].setText("O");
                       
                   }
                   
                   buttons[1][0].setEnabled(false);
                   
                   counter += 1;
               }
               else if ( e.getActionCommand().equals("square5")) {
                   
                   if (counter % 2 != 0 ) {
                       
                       label.setText("O's turn");
                       
                       buttons[1][1].setText("X");
                       
                   }
                   
                   else if (counter % 2 == 0) {
                       
                       label.setText("X's turn");
                           
                           buttons[1][1].setText("O");
                           
                   }
                   
                   buttons[1][1].setEnabled(false);
                   
                   counter =+ 1;
                   
               }
               
               else if (e.getActionCommand().equals("square6")) {
                   
                   if (counter % 2 != 0) {
                       
                       label.setText("O's turn");
                       
                       buttons[1][2].setText("X");
                           
                   }
                   
                   else if (counter % 2 == 0) {
                       
                       label.setText("X's turn") ;
                       
                       buttons[1][2].setText("O");
                   }
                   
                   buttons[1][2].setEnabled(false);
                   
                   
                   counter += 1;
                   
               } 
               
               else if (e.getActionCommand().equals("square7")) { 
                   
                   if (counter % 2 != 0) {
                       
                       label.setText("O's turn");
                       
                       buttons[2][0].setText("X");
                       
                   } else if (counter % 2 == 0) {
                       
                       label.setText("X's turn");
                       
                       buttons[2][0].setText("O");
                   }              
         
                buttons[2][0].setEnabled(false);
                
                counter += 1;
                
               } else if (e.getActionCommand().equals("square8")) {
                   
                   if (counter % 2 != 0) {
                       
                       label.setText("O's turn");
                       
                       buttons[2][1].setText("X");
                           
                   }
                   else if (counter % 2 == 0){
                       
                       label.setText("X's turn");
                       
                       buttons[2][1].setText("O");
                       
                   }
                   
                   buttons[2][1].setEnabled(false);
                   
                   counter += 1;
                   
               }
               
               else if (e.getActionCommand().equals("square9")) {
                   
                   if ( counter % 2 != 0) {
                       
                       label.setText("O's turn");
                       
                       buttons[2][2].setText("X");
                   }
                   
                   else if (counter % 2 == 0) {
                       
                       label.setText("X's turn");
                       
                       buttons[2][2].setText("O");
                   }
                   
                   buttons[2][2].setEnabled(false);
                   
                   counter += 1;
               }
           }
  
  
  
  public static void main(String[]args) {
    new tictactoe();
}
}