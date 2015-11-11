public class MyTriangle extends MyShape {

  public MyTriangle(int h, int w) {
    super(h, w);
  }

  public double getArea() {
    return (.5)*(height*width);
  }
  
  public String getName(){
    return "Triangle";
}
}