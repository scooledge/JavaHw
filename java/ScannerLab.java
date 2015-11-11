public class ScannerLab {
   
   private java.util.Scanner scan;
   
   public ScannerLab(){
     
     
     scan = new java.util.Scanner(System.in);
   }
   
   public void echoStrings() {
     
      String word;
      
      String[] hey;
      hey = new String[5];
      
      for(int i = 0; i < 5; i ++) {
         // prompt for the value
        
         System.out.print("Enter word " + i + ": ");
         // get the input value
         word = scan.next();
         // echo the input value
         System.out.println("You entered " + word);
         // store the input value into the array
         
         hey[i] = word;
      }
      String line = "";
      
      
      for( int k = 0; k < 5; k++) {
        
        line = line + hey[k] + ",";
      }
      // put a space between the words
      System.out.println("The words you entered are: " + line );
   }
   
   public void echoIntsAndTotal() {
      int inputValue;
      int[] myValues;
      
      myValues = new int[5];
      // declare an array to hold the 5 values
      for(int i = 0; i < 5; i ++) {
         // prompt for the value
         System.out.print("Enter integer value " + i + ": ");
         // get the input value
         inputValue = scan.nextInt();
         // echo the input value
         System.out.println("You entered " + inputValue);
         // store the input value into the array
      }
      int total = 0;
      // loop through the array and add the values
      System.out.println("The total of your values is " + total);
   }
   
   public static void main(String[] args) {
      ScannerLab lab;
      lab = new ScannerLab();
      lab.echoStrings();
      
      lab.echoIntsAndTotal();
   }
   
}