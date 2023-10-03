package Homework9.AdditionalTask;

import Homework9.AdditionalTask.halpStructures.Vectors;

public class Vector {

    private final float[] coordinates;
    public final String DESCRIPTION;

    public Vector(float setX, float setY) {
        coordinates = new float[2];
        coordinates[0] = setX;
        coordinates[1] = setY;
        DESCRIPTION = "Vector with tow parameters";
    }

    public Vector(float setX, float setY, float setZ) {
        coordinates = new float[3];
        coordinates[0] = setX;
        coordinates[1] = setY;
        coordinates[2] = setZ;
        DESCRIPTION = "Vector with three parameters";
    }

    public float[] getCoordinates() {
        return coordinates;
    }

    public double calculateLength() {
        float sum = 0;
        for(float coordinate : coordinates) {
            sum += coordinate * coordinate;
        }
        return Math.sqrt(sum);
    }

    public float calculateScalarMul(Vector secondVector) {
        float[] secondVectorCoordinates = secondVector.getCoordinates();
        float result = 0;
        if(secondVectorCoordinates.length == 3 && coordinates.length == 3) {
           result += coordinates[2] * secondVectorCoordinates[2];
        }
        result += coordinates[0] * secondVectorCoordinates[0] + coordinates[1] * secondVectorCoordinates[1];
        return result;
    }

    public Vector calculateSum(Vector secondVector) {
        float[] secondVectorCoordinates = secondVector.getCoordinates();
        float z = 0f;
        boolean thereIsZ = false;
        if(secondVectorCoordinates.length == 3){
            z += secondVectorCoordinates[2];
            thereIsZ = true;
        }
        if(coordinates.length == 3){
            z += coordinates[2];
            thereIsZ = true;
        }
        if(thereIsZ) {
            return new Vector(coordinates[0] + secondVectorCoordinates[0],
                    coordinates[1] + secondVectorCoordinates[1], z);
        }
        return new Vector(coordinates[0] + secondVectorCoordinates[0],
                coordinates[1] + secondVectorCoordinates[1]);
    }

    public Vector calculateDif(Vector secondVector) {
        float[] secondVectorCoordinates = secondVector.getCoordinates();
        float z = 0f;
        boolean thereIsZ = false;
        if(secondVectorCoordinates.length == 3){
            z -= secondVectorCoordinates[2];
            thereIsZ = true;
        }
        if(coordinates.length == 3){
            z += coordinates[2];
            thereIsZ = true;
        }
        if(thereIsZ) {
            return new Vector(coordinates[0] - secondVectorCoordinates[0],
                    coordinates[1] - secondVectorCoordinates[1], z);
        }
        return new Vector(coordinates[0] - secondVectorCoordinates[0],
                coordinates[1] - secondVectorCoordinates[1]);
    };

    public void displayInformation() {
        System.out.print(DESCRIPTION);
        if(coordinates.length == 3) {
            System.out.printf("   {%.2f; %.2f; %.2f}\n", coordinates[0], coordinates[1], coordinates[2]);
        } else {
            System.out.printf("   {%.2f; %.2f}\n", coordinates[0], coordinates[1]);
        }
    }

    public static Vector[] getRandomVectors(int n, Vectors typeOfVector) {
        Vector[] vectors = new Vector[n];
        if(typeOfVector == Vectors.TWO_COORDINATES) {
            for(int i = 0; i < n; i++) {
                vectors[i] = new Vector((float)Math.random() * 30 - 15, (float)Math.random() * 30 - 15);
            }
        } else {
            for(int i = 0; i < n; i++) {
                vectors[i] = new Vector((float)Math.random() * 30 - 15,
                        (float)Math.random() * 30 - 15,
                        (float)Math.random() * 30 - 15);
            }
        }
        return vectors;
    }

    public String compare(Vector secondVector) {
        if (calculateLength() > secondVector.calculateLength()) {
            return "Этот вектор больше входного параметра (Первый вектор больше второго)";
        }
        if(calculateLength() < secondVector.calculateLength()) {
            return "Этот меньше больше входного параметра (Первый вектор меньше второго)";
        }
        return  "Векторы равны";
    };
}
