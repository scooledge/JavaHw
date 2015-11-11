import java.util.ArrayList;

public class MyArrayList {
  
   java.util.List<String> list ;
  
  public MyArrayList() {
    
    list = new java.util.LinkedList<String>();
  }
  
  public  void aDD(){
    
    list.add("yolo");
    list.add("testing");
    list.add("a second test");
 
  }
  
  public void showStringList() { 
  System.out.println("Contents of the list:"); 
  for(int i = 0; i < list.size(); i++) 
    System.out.println("\"" + list.get(i) + "\""); 
}

  
  
  
  public static void main(String[] args){
  
    
    MyArrayList listing = new MyArrayList();
    listing.aDD();
    listing.showStringList();
    
}
}