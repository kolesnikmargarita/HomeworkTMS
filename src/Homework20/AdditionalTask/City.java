package Homework20.AdditionalTask;

public class City {

    private int id;
    private String name;
    private int studentId;

    public City(String senName, int setStudentId) {
        name = senName;
        studentId = setStudentId;
    }

    public String getSQLAddCommand() {
        return "INSERT INTO cities (cityName, studentId) value ('" + name + "', '" + studentId + "')";
    }
}
