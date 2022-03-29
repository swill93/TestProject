
public class Sqaure extends GeometricObject implements Colorable{
  
  private double side;
  
  public void Square(){

  }
  public void Square(double side){
      this.side = side;
  }
  public void setSide(double side){
      this.side = side;
  }
  public double getSide(){
      return side;
  }
  
  public double getArea(){
      return Math.pow(side, 2);
  }
  
  public double getPerimeter(){
      return side * 4;
  }
  
  public String howToColor(){
      return "Color all four sides";
  }
}

