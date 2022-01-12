import java.awt.Color;

public class ShapeTester_6Sochan {
  public static void main(String args[]) {
    Shape boringShape1 = new Shape(0,10,Color.black);
    Shape boringShape2 = new Shape(200,350);
    Circle coolCircle1 = new Circle(5,2,Color.yellow,3);
    Circle coolCircle2 = new Circle(25,25,Color.red,15);
    
    System.out.println("Area: " + boringShape1.getArea());
    System.out.println("Area: " + boringShape2.getArea());
    System.out.println("Area: " + coolCircle1.getArea());
    System.out.println("Area: " + coolCircle2.getArea());
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
    /**
    Alternate constructor that takes the x, y location AND
    a color object and initializes all instance variables.
    */
    public Shape( int xLocation, int yLocation, Color c) {
      xLoc = xLocation;
      yLoc = yLocation;
      color = c;
    }

    public double getArea( ) { return 0; }

}

// Circle object that has an instance field for radius and radius
class Circle extends Shape {
  private int radius;
  
  public Circle(int x, int y, Color color, int radius) {
    super(x,y,color);
    this.radius = radius;
  } 
  
  public double getArea() {
    return Math.PI*(radius*radius);
  }
}





















/** 5) Create a public tester class: ShapeTester_Lastna
       Create a few objects, print out thier areas
*/