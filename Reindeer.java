
import java.util.*;

/**
 * This is the starting point code for Lab: Reindeer.
 */
public class Reindeer {

  // The reindeer
  private java.util.Collection reindeer;
  
  
  private String names;
  
  public Reindeer() {
    
    reindeer = new java.util.ArrayList<String>();
 
  }
  /**
   * Constructor, which you will write
   */
 
  /**
   * Add the names of the reindeer to the collection.
   */
  public void addReindeer() {
   add("Dasher");
   add("Dancer");
  add("Prancer");
   add("Vixen");
  add("Comet");
   add("Cupid");
    add("Dunder");
    add("Blixem");
  }
  
  /**
   * A simple method to print out the contents of
   * the collection
   */
  
  
   public void add(String names) {
     reindeer.add(names);
  }
  
  public void print() {
    Iterator<String> it = reindeer.iterator();
  
    while(it.hasNext()) {
      System.out.print(it.next() + " ");
    }
     
    System.out.println();
  }
  /**
   * The application method, which you will write
   * @param args Command-line arguments
   */
  
  public static void main(String[] args){
    
    Reindeer santa = new Reindeer();
    System.out.println("using an arraylist:");
    santa.addReindeer();
    santa.print();
    
    System.out.println("using a linked list");
    
    santa.reindeer = new java.util.LinkedList<String>();
    
    santa.addReindeer();
    santa.print();
    
    System.out.println("using a hashed data structure");
    
    santa.reindeer =  new java.util.HashSet<String>();
    santa.addReindeer();
    santa.print();
    
    
  }
    
    
  
  
}