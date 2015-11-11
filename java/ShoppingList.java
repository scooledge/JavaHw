public class ShoppingList {
    
    private java.util.Scanner scan;
    // declare storage for the list items
    String[] list = new String[100];
    
    public ShoppingList() {
        scan = new java.util.Scanner(System.in);
        
    }
    
    public void printList() {
      
      int z = 0 ;
      if(z < list.length) 
        
      z++;
        System.out.println("Your shopping list:" + getInput());
       
    }
    
    public void addToList(String item) {
        
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
        System.out.println("  -r n : Remove the nth item from the list");
        System.out.println("  -x : Exit the application");
        System.out.println("  -h : Print this command list");
    }
    
    public void go() {
        String input;
        
        printWelcome();
        printHelp();
        input = getInput();
        while( ! input.equals("-x")) {
         
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
    
    private void testList() {
      String[] list = new String[3];
      list[0] = "pizza";
      list[1] = "milk";
      list[2] = "bread";
    }
    
    
    public static void main(String[] args) {
        ShoppingList list;
        
        list = new ShoppingList();
        
        list.printList();
        list.testList();
        list.printList();
        list.go();
    }
    
}