abstract class Shape{
    String name;
    Shape(String name){ //special method
        this.name = name;
    }
    void displayName(){
        System.out.println("Shape Name is: " + name);
    }
    
    abstract double calculateArea();
}

class Circle extends Shape{
    double radius;

    Circle(double r){
        super("Circle");
        this.radius = r;
    }
     // Override Annotation
    @Override
    double calculateArea(){
        return Math.PI * radius * radius; // pi*r^2
    }
}
public class Today {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        c.displayName();
        System.out.println("Calculated Area of Circle is: " + c.calculateArea());
    }
}
