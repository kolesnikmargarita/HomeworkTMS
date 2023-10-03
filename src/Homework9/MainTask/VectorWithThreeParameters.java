package Homework9.MainTask;

import Homework9.MainTask.halpStructures.Coordinate;
import Homework9.MainTask.halpStructures.Vector;

import java.util.HashMap;

public class VectorWithThreeParameters extends Vector {

    private float z;
    public static final String DESCRIPTION = "Vector with three parameters";

    public VectorWithThreeParameters(float setX, float setY, float setZ) {
        super(setX, setY);
        z = setZ;
    }

    @Override
    public HashMap<Coordinate, Float> getCoordinates() {
        HashMap<Coordinate, Float> coordinates = new HashMap<>();
        coordinates.put(Coordinate.X, x);
        coordinates.put(Coordinate.Y, y);
        coordinates.put(Coordinate.Z, z);
        return coordinates;
    }

    @Override
    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public float calculateScalarMul(Vector secondVector) {
        HashMap<Coordinate, Float> secondVectorCoordinates = secondVector.getCoordinates();
        if(!secondVectorCoordinates.containsKey(Coordinate.Z)) {
            secondVectorCoordinates.put(Coordinate.Z, 0f);
        }
        return x * secondVectorCoordinates.get(Coordinate.X)
                + y * secondVectorCoordinates.get(Coordinate.Y)
                + z * secondVectorCoordinates.get(Coordinate.Z);
    }

    @Override
    public Vector calculateSum(Vector secondVector) {
        HashMap<Coordinate, Float> secondVectorCoordinates = secondVector.getCoordinates();
        if(!secondVectorCoordinates.containsKey(Coordinate.Z)) {
            secondVectorCoordinates.put(Coordinate.Z, 0f);
        }
        return new VectorWithThreeParameters(x + secondVectorCoordinates.get(Coordinate.X),
                y + secondVectorCoordinates.get(Coordinate.Y),
                z + secondVectorCoordinates.get(Coordinate.Z));
    }

    @Override
    public Vector calculateDif(Vector secondVector) {
        HashMap<Coordinate, Float> secondVectorCoordinates = secondVector.getCoordinates();
        if(!secondVectorCoordinates.containsKey(Coordinate.Z)) {
            secondVectorCoordinates.put(Coordinate.Z, 0f);
        }
        return new VectorWithThreeParameters(x - secondVectorCoordinates.get(Coordinate.X),
                y - secondVectorCoordinates.get(Coordinate.Y),
                z - secondVectorCoordinates.get(Coordinate.Z));
    }

    @Override
    public void displayInformation() {
        System.out.print(DESCRIPTION);
        System.out.printf("   {%.2f; %.2f; %.2f}\n", x, y, z);
    }

    public static Vector[] getRandomVectors(int n) {
        Vector[] vectors = new VectorWithThreeParameters[n];
        for(int i = 0; i < n; i++) {
            vectors[i] = new VectorWithThreeParameters((float)Math.random() * 30 - 15,
                    (float)Math.random() * 30 - 15,
                    (float)Math.random() * 30 - 15);
        }
        return vectors;
    }
}
