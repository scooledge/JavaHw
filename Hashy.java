import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Hashy{

  public HashMap<String,Color> colors;
  
  public Hashy(){

colors = new HashMap<String,Color>();
  }
 
 public void coloring(){
colors = new HashMap<String,Color>();

colors.put("red", new Color(204,0,0));

colors.put("brown", new Color(153,102,0));

colors.put("purple", new Color(160,0,160));

Color treeTrunk = colors.get("brown");
System.out.println(treeTrunk);

Color ocean = colors.get("blue");
System.out.println(ocean);
 }
 
 
 public static void main(String[] args) {
  
 Hashy go = new Hashy();
 }
}