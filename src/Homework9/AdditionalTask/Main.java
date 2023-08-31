package Homework9.AdditionalTask;

import Homework9.AdditionalTask.halpStructures.Vectors;

public class Main {

    public static void main(String[] args) {
        Vector[] vectorsWithTwoParameters = Vector.getRandomVectors(3, Vectors.TWO_COORDINATES);
        Vector[] vectorsWithThreeParameters = Vector.getRandomVectors(2, Vectors.THREE_COORDINATES);
        for(Vector vector : vectorsWithTwoParameters) {
            vector.displayInformation();
        }
        System.out.println();
        vectorsWithTwoParameters[2].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithTwoParameters[2].calculateLength());
        System.out.println();
        vectorsWithTwoParameters[0].displayInformation();
        vectorsWithTwoParameters[1].displayInformation();
        System.out.print("Sum of this vectors = ");
        vectorsWithTwoParameters[0].calculateSum(vectorsWithTwoParameters[1]).displayInformation();
        System.out.print("Difference of this vectors = ");
        vectorsWithTwoParameters[0].calculateDif(vectorsWithTwoParameters[1]).displayInformation();
        System.out.print("Scalar multiply of this vectors = "
                + vectorsWithTwoParameters[0].calculateScalarMul(vectorsWithTwoParameters[1]));
        System.out.println("\n");
        vectorsWithTwoParameters[0].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithTwoParameters[0].calculateLength());
        vectorsWithTwoParameters[1].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithTwoParameters[1].calculateLength());
        System.out.println(vectorsWithTwoParameters[0].compare(vectorsWithTwoParameters[1]));
        System.out.println("\n");

        for(Vector vector : vectorsWithThreeParameters) {
            vector.displayInformation();
        }
        System.out.println();
        vectorsWithThreeParameters[0].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithThreeParameters[0].calculateLength());
        vectorsWithThreeParameters[1].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithThreeParameters[1].calculateLength());
        System.out.println(vectorsWithThreeParameters[0].compare(vectorsWithThreeParameters[1]));
        System.out.println();
        System.out.print("Sum of this vectors = ");
        vectorsWithThreeParameters[0].calculateSum(vectorsWithThreeParameters[1]).displayInformation();
        System.out.print("Difference of this vectors = ");
        vectorsWithThreeParameters[0].calculateDif(vectorsWithThreeParameters[1]).displayInformation();
        System.out.print("Scalar multiply of this vectors = "
                + vectorsWithThreeParameters[0].calculateScalarMul(vectorsWithThreeParameters[1]));
        System.out.println("\n");

        vectorsWithTwoParameters[0].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithTwoParameters[0].calculateLength());
        vectorsWithThreeParameters[0].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithThreeParameters[0].calculateLength());
        System.out.println(vectorsWithTwoParameters[0].compare(vectorsWithThreeParameters[0]));
        System.out.print("Sum of this vectors = ");
        vectorsWithTwoParameters[0].calculateSum(vectorsWithThreeParameters[0]).displayInformation();
        System.out.print("Difference of this vectors = ");
        vectorsWithTwoParameters[0].calculateDif(vectorsWithThreeParameters[0]).displayInformation();
        System.out.print("Scalar multiply of this vectors = "
                + vectorsWithTwoParameters[0].calculateScalarMul(vectorsWithThreeParameters[0]));
        System.out.println("\n");

        vectorsWithThreeParameters[0].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithThreeParameters[0].calculateLength());
        vectorsWithTwoParameters[0].displayInformation();
        System.out.println("Length of this vector = " + vectorsWithTwoParameters[0].calculateLength());
        System.out.println(vectorsWithThreeParameters[0].compare(vectorsWithTwoParameters[0]));
        System.out.print("Sum of this vectors = ");
        vectorsWithThreeParameters[0].calculateSum(vectorsWithTwoParameters[0]).displayInformation();
        System.out.print("Difference of this vectors = ");
        vectorsWithThreeParameters[0].calculateDif(vectorsWithTwoParameters[0]).displayInformation();
        System.out.print("Scalar multiply of this vectors = "
                + vectorsWithThreeParameters[0].calculateScalarMul(vectorsWithTwoParameters[0]));
    }
}
