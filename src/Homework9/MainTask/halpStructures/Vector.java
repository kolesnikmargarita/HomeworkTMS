package Homework9.MainTask.halpStructures;

import java.util.HashMap;

public abstract class Vector {

    protected float x;
    protected float y;

    protected Vector(float setX, float setY) {
        x = setX;
        y = setY;
    }

    public abstract double calculateLength();
    public abstract float calculateScalarMul(Vector secondVector);
    public abstract Vector calculateSum(Vector secondVector);
    public abstract Vector calculateDif(Vector secondVector);
    public String compare(Vector secondVector) {
        if (calculateLength() > secondVector.calculateLength()) {
            return "Этот вектор больше входного параметра (Первый вектор больше второго)";
        }
        if(calculateLength() < secondVector.calculateLength()) {
            return "Этот меньше больше входного параметра (Первый вектор меньше второго)";
        }
        return  "Векторы равны";
    }
    public abstract void displayInformation();
    public abstract HashMap<Coordinate, Float> getCoordinates();
}
