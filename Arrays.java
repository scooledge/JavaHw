


public class Arrays{
  
  int[] numbers;
  
  public Arrays() {

    numbers = new int[] {2,3,4};
    
    
  }
  
  public void doStuff() {
    
    
    
     for(int i = 0; i < numbers.length; i++){
      
      numbers[i] = (int)(Math.pow(2,i) );
      
      System.out.println(numbers[i]);
      
    }
    
  }
  
  public static void main (String[] args){
    
    Arrays list = new Arrays();
    list.doStuff();
    
  }
  
}
    