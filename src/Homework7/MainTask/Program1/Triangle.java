package Homework7.MainTask.Program1;

public class Triangle implements Figure {

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
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
    }
}
