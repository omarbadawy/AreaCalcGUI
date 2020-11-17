package areacalcgui.shapes;

public class Triangle extends Shape {
    private float side1, side2, side3;
    
    public Triangle() {
        this.side1 = 1.0f;
        this.side2 = 1.0f;
        this.side3 = 1.0f;
    }
    
    public void setSide1(float side1) {
        this.side1 = side1;
    }
    
    public void setSide2(float side2) {
        this.side2 = side2;
    }
    
    public void setSide3(float side3) {
        this.side3 = side3;
    }
    
    public float getSide1() {
        return this.side1;
    }
    
    public float getSide2() {
        return this.side2;
    }
    
    public float getSide3() {
        return this.side3;
    }
    
    public void validateTriangle() {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new ArithmeticException("These Sides Can't Make A Triangle!");
        }
    }
    
    @Override
    public void calcArea() {
        float s = (this.side1 + this.side2 + this.side3) / 2;
        this.area = (float) Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    };
    
    @Override
    public void calcPerimeter() {
        this.perimeter = this.side1 + this.side2 + this.side3;
    };
    
    @Override
    public void validate() {
        if ((side1 == 0.0f) || (side2 == 0.0f) || (side3 == 0.0f)) {
            throw new ArithmeticException("Sides Can't Be Zero!");
        } else if ((side1 < 0.0f) || (side2 < 0.0f) || (side3 < 0.0f)) {
            throw new ArithmeticException("Sides Can't Be Negative!");
        }
    };
}
