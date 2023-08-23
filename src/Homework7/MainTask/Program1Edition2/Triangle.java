package Homework7.MainTask.Program1Edition2;

public class Triangle extends Figure {

    double firstSide;
    double secondSide;
    double thirdSide;

    public Triangle(double setFirstSide, double setSecondSide, double setThirdSide) {
        firstSide = setFirstSide;
        secondSide = setSecondSide;
        thirdSide = setThirdSide;
    }

    @Override
    public double calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double calculateSquare() {
        double cos = (firstSide * firstSide + secondSide * secondSide - thirdSide * thirdSide) / (2 * firstSide * secondSide);
        return Math.sin(Math.acos(cos)) * firstSide * secondSide / 2;
    }
}
