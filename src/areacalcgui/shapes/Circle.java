package areacalcgui.shapes;

public class Circle extends Shape {
    private float radius;
    
    public Circle() {
        radius = 1.0f;
    }
    
    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    public float getRadius() {
        return this.radius;
    }
    
    @Override
    public void calcArea() {
        this.area = (float) (Math.PI * (this.radius * this.radius));
    };
    
    @Override
    public void calcPerimeter() {
        this.perimeter = (float) (2 * Math.PI * this.radius);
    };
    
    @Override
    public void validate() {
        if (this.radius == 0.0f) {
            throw new ArithmeticException("Radius Can't Be Zero!");
        } else if (this.getRadius() < 0.0f) {
            throw new ArithmeticException("Radius Can't Be A Negative!");
        }
    };
}
