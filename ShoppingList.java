import java.util.*;

public class ShoppingList {
    
    private String[] MyList;  
    
    private int counter;
    
    private java.util.Scanner scan;
    // declare storage for the list items
    
    public ShoppingList() {
      
       int counter = 0;
      
       int MAXSIZE = 10;
       
       String[] MyList = new String[MAXSIZE];
      
        scan = new java.util.Scanner(System.in);
        // initialize storage for list items
    }
    
    public void printList() {
        System.out.println("Your shopping list:");
        
        System.out.println(MyList);
        
        // print the list
    }
    
    
    public void addToList(String item) {
      
      for(int i = 0; i < MyList.length ; i++){
      
      MyList[counter] = item;
      counter++;
      
    }
    }
    
    public void emptyList() {
        // empty the list
    }
    
    public String getInput() {
        System.out.print("Enter your item or command: ");
        return scan.next().trim();
    }
    
    public void printWelcome() {
        System.out.println("Welcome to the XYZ Shopping List Program.");
    }
    
    public void printThankYou() {
        System.out.println("Thank you for using the XYZ Shopping List Program.");
    }
    
    public void printHelp() {
        System.out.println("Here are the list of commands:");
        System.out.println("  -p : Print the list");
        System.out.println("  -e : Empty the list");
//      System.out.println("  -r n : Remove the nth item from the list");
        System.out.println("  -x : Exit the application");
        System.out.println("  -h : Print this command list");
    }
    
    public void go() {
        String input;
        
        printWelcome();
        printHelp();
        input = getInput();
        while( ! input.equals("-x")) {
            /*switch(input) {
                case "-h":
                    printHelp();
                    break;
                case "-p":
                    printList();
                    break;
                case "-x":
                    break;
                case "-e":
                    emptyList();
                    break;
                default:
                    addToList(input); */
            
//alternate (pre-Java 1.7) implementation
            if(input.equals("-h")) {
                printHelp();
            } else if(input.equals("-p")) {
                printList();
            } else if(input.equals("-e")) {
                emptyList();
            } else {
                addToList(input);
            }
//*/
            input = getInput();
        }
        printThankYou();
    }
    
    public static void main(String[] args) {
        ShoppingList list;
        
        list = new ShoppingList();
        list.go();
        list.printList();
    }
}
    