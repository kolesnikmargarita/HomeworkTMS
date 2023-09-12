package Homework7.MainTask.Program1Edition2;

public class Circle extends Figure{

    float radius;

    public Circle(float setRadius) {
        radius = setRadius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * radius * radius;
    }
}
