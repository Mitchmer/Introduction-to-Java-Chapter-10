//Define the Circle2D class that contains:

//Two double data fields named x and y that specify the center of the circle with getter methods.

//A data field radius with a getter method.

//A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.

//A constructor that creates a circle with the specified x, y, and radius.

//A method getArea() that returns the area of the circle.

//A method getPerimeter() that returns the perimeter of the circle.

//A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle (see Figure a).

//A method contains(Circle2D circle) that returns true if the specified circle is inside this circle (see Figure b).

//A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle (see Figure c).

//Implement the class. Write a main method that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)), 

//displays its area and perimeter, and displays the result of c1.contains(3, 3), 

//c1.contains(newCircle2D(4, 5, 10.5)), and c1.overlaps(new Circle2D(3, 5, 2.3)).

public class Project3 {
  public static void main(String[] args) {
    Circle2D c1 = new Circle2D(2, 2, 5.5);
    System.out.println("" + c1.getArea());
    System.out.println("" + c1.getPerimeter());
    System.out.println("" + c1.contains(3, 3));
    System.out.println("" + c1.contains(new Circle2D(4, 5, 10.5)));
    System.out.println("" + c1.overlaps(new Circle2D(3, 5, 2.3)));

  }
}

class Circle2D {
    private double x;
    private double y;
    private double radius;

    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    double getRadius() {
        return this.radius;
    }

    Circle2D() {
        this(0,0,1);
    }
    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double getArea() {
        return (Math.PI * this.radius * this.radius);
    }
    double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }
    boolean contains(double x, double y) {
        // if distance is less than this circle's radius
        return (Math.pow((((this.x - x)*(this.x - x)) + ((this.y - y)*(this.y - y))), 0.5) <= this.radius);
    }
    boolean contains(Circle2D circle) {
        // if distance + param radius are less than this circle's radius
        return ((Math.pow((((this.x - circle.getX())*(this.x - circle.getX())) + ((this.y - circle.getY())*(this.y - circle.getY()))), 0.5) + circle.getRadius()) <= this.radius);
    }
    boolean overlaps(Circle2D circle) {
        // distance < r1 + r2
        return (Math.pow((((this.x - circle.getX())*(this.x - circle.getX())) + ((this.y - circle.getY())*(this.y - circle.getY()))), 0.5) < (this.radius + circle.getRadius()));
    }
}