
package areacalcgui.shapes;

public class Rectangle extends Shape {
    private float width, height;
    
    public Rectangle() {
        width = 1.0f;
        height = 1.0f;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public float getWidth() {
        return this.width;
    }
    
    public float getHeight() {
        return this.height;
    }
    
    
    @Override
    public void calcArea() {
        this.area = this.width * this.height;
    };
    
    @Override
    public void calcPerimeter() {
        this.perimeter = (this.width + this.height) * 2;
    };
    
     @Override
    public void validate() {
        if ((this.width == 0.0f) || (this.height == 0.0f)) {
            throw new ArithmeticException("Height Or Width Can't Be Zero!");
        } else if ((this.width < 0.0f) || (this.height < 0.0f)) {
            throw new ArithmeticException("Height Or Width Can't Be Negative!");
        }
    };
}
