


public class ButtonButton implements java.awt.event.ActionListener {

 
  
  private NscWindow win;
  
  private NscEllipse oval;
  
  public ButtonButton() {
    
    win = new NscWindow();
    
    win.setTitle("ButtonButton");
    
    oval = new NscEllipse(100,70,200,250);
    
    oval.setFilled(true);
    
    oval.setBackground(java.awt.Color.blue);
    
    win.add(oval);
    
    win.repaint();
    
    
    javax.swing.JButton btn;
    
    btn = new javax.swing.JButton("click me");
    
    btn.setSize(170,35);
    btn.setLocation(110,10);
    win.add(btn);
    
    btn.addActionListener(this);
    
  }
  
  public void actionPerformed(java.awt.event.ActionEvent e){
  
    javax.swing.JButton btn;
    
    btn = (javax.swing.JButton)e.getSource();
    
    
    btn.setText("thanks, i needed that");
    
    oval.setBackground(java.awt.Color.green);
    
    win.repaint();
  }
    
  public static void main(String[] args) {
    
    new ButtonButton();
    
  }}