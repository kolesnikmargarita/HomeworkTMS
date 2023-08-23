package Homework7.MainTask.Program1;

public class Main {

    public static void main(String[] args) {

        Figure[] arrOfFigures = new Figure[5];
        arrOfFigures[0] = new Rectangle(6,  10);
        arrOfFigures[1] = new Triangle(4, 7, 6);
        arrOfFigures[2] = new Rectangle(6.3f, 7.28f);
        arrOfFigures[3] = new Circle(5.7f);
        arrOfFigures[4] = new Circle(3);
        for(Figure figure : arrOfFigures) {
            System.out.println("периметр = " + figure.calculatePerimeter() + "  площадь = " + figure.calculateSquare());
        }
    }
}