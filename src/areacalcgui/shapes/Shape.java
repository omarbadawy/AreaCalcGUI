package areacalcgui.shapes;

public abstract class Shape {
    protected float area, perimeter;
    
    
    public Shape() {
        area = 0.0f;
        perimeter = 0.0f;
    }
    
    public abstract void calcArea();
    public abstract void calcPerimeter();
    public abstract void validate();
    
    public float getArea() {
        return this.area;
    }
    
    public float getPerimeter() {
        return this.perimeter;
    }
}

