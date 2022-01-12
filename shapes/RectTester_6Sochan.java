import java.awt.Color;

public class RectTester_6Sochan {
  public static void main(String args[]) {
    
    Shape shapeObjectVariable = new Shape(3, 5, Color.RED);
    Rectangle rectangleObject = new Rectangle(3, 5, Color.RED, 10, 20);
    Rectangle rectangleObject2 = new Rectangle(3, 5, Color.RED, 10, 20);
    Rectangle rectangleObject3 = new Rectangle(3, 5, Color.RED, 10, 30);
    System.out.println(rectangleObject);
    System.out.println(shapeObjectVariable.equals( rectangleObject)); // returns true !!?! Yes!
    System.out.println(rectangleObject.equals(rectangleObject2)); // returns true because same rectangle
    System.out.println(rectangleObject.equals(rectangleObject3)); // returns false because different height
    

  }
}

class Shape {
    private int xLoc;
    private int yLoc;
    private Color color;

    public Shape( int xLocation, int yLocation ) {
    	xLoc = xLocation;
    	yLoc = yLocation;
    }
    public int getX() {return xLoc;}
    public int getY() {return yLoc;}
    public Color getColor() {return color;}
    /**
      Alternate constructor that takes the x, y location and
     	a color object and initializes all instance variables.
    */
    public Shape( int xLocation, int yLocation, Color c) {
      xLoc = xLocation;
      yLoc = yLocation;
      color = c;
    }







    public double getArea( ) { return 0; }
    public String toString() {
      String s1 = "Shape at (" + getX() + "," + getY() + ") with ";
      String s2 = "whose color is " + getColor();
    return s1 + s2;
    }
    
    public boolean equals(Object compareShape) { 
      Shape compare = (Shape)(compareShape);
      if (getX() == compare.getX()) {
        if (getY() == compare.getY()) {
          if (getColor() == compare.getColor()) {
            return true;
          }
        }
      }
      return false;
    }
}

/*
  Circle object that has an instance field for radius and
	inherits the x,y and color from the Shape class. 

*/
class Circle extends Shape {
  private int radius;
  
  public Circle(int x, int y, Color color, int radius) {
    super(x,y,color);
    this.radius = radius;
  } 
  
  @Override
  public double getArea() {
    return Math.PI*(radius*radius);
  }
  
  @Override
  public String toString() {
    String s1 = "Circle centered at (" + getX() + "," + getY() + ") with ";
    String s2 = "radius " + radius + " and whose color is " + getColor();
    return s1 + s2;
  }
}

class Rectangle extends Shape {
  private int width;
  private int height;
  
  public Rectangle(int x, int y, Color color, int width, int height) {
    super(x,y,color);
    this.width = width;
    this.height = height;
  } 
  
  @Override
  public double getArea() {
    return width*height;
  }
  
  @Override
  public String toString() {
    String s1 = "Rectange at (" + getX() + "," + getY() + ") with ";
    String s2 = "width " + width + ", height " + height + " and whose color is " + getColor();
    return s1 + s2;
    wow();
  }
  
  @Override
  public boolean equals(Object compareShape) { 
    Rectangle compare = (Rectangle)(compareShape);
    if (super.equals(compare) && this.width == compare.width && this.height == compare.height) return true;
    else return false;
  }
}