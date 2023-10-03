package Homework9.MainTask;

import Homework9.MainTask.halpStructures.Coordinate;
import Homework9.MainTask.halpStructures.Vector;

import java.util.HashMap;

public class VectorWithTwoParameters extends Vector {
    public static final String DESCRIPTION = "Vector with tow parameters";

    public VectorWithTwoParameters(float setX, float setY) {
        super(setX, setY);
    }

    @Override
    public HashMap<Coordinate, Float> getCoordinates() {
        HashMap<Coordinate, Float> coordinates = new HashMap<>();
        coordinates.put(Coordinate.X, x);
        coordinates.put(Coordinate.Y, y);
        return coordinates;
    }

    @Override
    public double calculateLength() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public float calculateScalarMul(Vector secondVector) {
        HashMap<Coordinate, Float> secondVectorCoordinates = secondVector.getCoordinates();
        if(secondVectorCoordinates.containsKey(Coordinate.Z)) {
           return  secondVector.calculateScalarMul(this);
        }
        return x * secondVectorCoordinates.get(Coordinate.X) + y * secondVectorCoordinates.get(Coordinate.Y);
    }

    @Override
    public Vector calculateSum(Vector secondVector) {
        HashMap<Coordinate, Float> secondVectorCoordinates = secondVector.getCoordinates();
        if(secondVectorCoordinates.containsKey(Coordinate.Z)) {
            return secondVector.calculateSum(this);
        }
        return new VectorWithTwoParameters(x + secondVectorCoordinates.get(Coordinate.X),
                y + secondVectorCoordinates.get(Coordinate.Y));
    }

    @Override
    public Vector calculateDif(Vector secondVector) {
        HashMap<Coordinate, Float> secondVectorCoordinates = secondVector.getCoordinates();
        if(secondVectorCoordinates.containsKey(Coordinate.Z)) {
            return secondVector.calculateDif(this);
        }
        return new VectorWithTwoParameters(x - secondVectorCoordinates.get(Coordinate.X),
                y - secondVectorCoordinates.get(Coordinate.Y));
    }

    @Override
    public void displayInformation() {
        System.out.print(DESCRIPTION);
        System.out.printf("   {%.2f; %.2f}\n",x,y);
    }

    public static Vector[] getRandomVectors(int n) {
        Vector[] vectors = new VectorWithTwoParameters[n];
        for(int i = 0; i < n; i++) {
            vectors[i] = new VectorWithTwoParameters((float)Math.random() * 30 - 15, (float)Math.random() * 30 - 15);
        }
        return vectors;
    }
}