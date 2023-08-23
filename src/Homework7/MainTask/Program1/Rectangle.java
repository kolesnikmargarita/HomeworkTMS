package Homework7.MainTask.Program1;

public class Rectangle implements Figure {

    float firstSide;
    float secondSide;

    public Rectangle(float setFirstSide, float setSecondSide) {
        firstSide = setFirstSide;
        secondSide = setSecondSide;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * firstSide + 2 * secondSide;
    }

    @Override
    public double calculateSquare() {
        return firstSide * secondSide;
    }
}
